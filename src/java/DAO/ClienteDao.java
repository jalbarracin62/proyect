/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dato.ClienteJc;
import Servicios.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mario-Bx
 */
public class ClienteDao {

    private Connection connection;

    public ClienteDao() {
        connection = DbUtil.getConnection();
    }

    public void addCliente(ClienteJc newclClienteJc) {
        try {
            /// sentencia para insertar en la tabla
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into ClienteBD(Cedula,Nombre,Apellido,Nivel,Total_compras) values (?,?,?,?,?)");
            // parametros de inicio para agregar...
            preparedStatement.setInt(1, newclClienteJc.getCedula());
            preparedStatement.setString(2, newclClienteJc.getNombre());
            preparedStatement.setString(3, newclClienteJc.getApellido());
            preparedStatement.setInt(4, newclClienteJc.getNivle());
            preparedStatement.setInt(5, newclClienteJc.getTotalCompras());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCliente(int clienteID) {
        try {
            System.out.println("Entro a eliminar");
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from ClienteBD where Id_Cliente=?");
            // Parameters start with 1
            preparedStatement.setInt(1, clienteID);
            preparedStatement.executeUpdate();
            System.out.println("Elimino El  Esquema");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCliente(ClienteJc newclClienteJc, int cs) {
        try {
            /// sentencia para insertar en la tabla
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update ClienteBD set Cedula=?, Nombre=?, Apellido=?, Nivel=?, Total_compras=? where Id_Cliente=" + cs);
            // parametros de inicio para actualizar...
            preparedStatement.setInt(1, newclClienteJc.getCedula());
            preparedStatement.setString(2, newclClienteJc.getNombre());
            preparedStatement.setString(3, newclClienteJc.getApellido());
            preparedStatement.setInt(4, newclClienteJc.getNivle());
            preparedStatement.setInt(5, newclClienteJc.getTotalCompras());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<ClienteJc> getAllClientes() {
        List<ClienteJc> clientesListas = new ArrayList<ClienteJc>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from ClienteBD");
            while (rs.next()) {
                ClienteJc newclClienteJc = new ClienteJc();
                newclClienteJc.setClientID(rs.getInt("Id_Cliente"));
                newclClienteJc.setCedula(rs.getInt("Cedula"));
                newclClienteJc.setNombre(rs.getString("Nombre"));
                newclClienteJc.setApellido(rs.getString("Apellido"));
                newclClienteJc.setNivle(rs.getInt("Nivel"));
                newclClienteJc.setTotalCompras(rs.getInt("Total_compras"));

                clientesListas.add(newclClienteJc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientesListas;
    }

    public ClienteJc getClienteById(int ClienteId) {
        ClienteJc newclClienteJc = new ClienteJc();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from ClienteBD where Id_Cliente=?");
            preparedStatement.setInt(1, ClienteId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                newclClienteJc.setClientID(rs.getInt("Id_Cliente"));
                newclClienteJc.setCedula(rs.getInt("Cedula"));
                newclClienteJc.setNombre(rs.getString("Nombre"));
                newclClienteJc.setApellido(rs.getString("Apellido"));
                newclClienteJc.setNivle(rs.getInt("Nivel"));
                newclClienteJc.setTotalCompras(rs.getInt("Total_compras"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return newclClienteJc;
    }
}
