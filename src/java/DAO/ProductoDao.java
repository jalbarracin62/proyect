package DAO;

import Dato.ClienteJc;
import Dato.ProductoJc;
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
 * @author Juan Albarracin
 */
public class ProductoDao{

    private Connection connection;

    public ProductoDao() {
        connection = DbUtil.getConnection();
    }

    public void addCliente(ProductoJc newclClienteJc) {
        try {
            /// sentencia para insertar en la tabla
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into ProductoBD(Ancho,Alto,Precio,Cantidad,Id_CotizacionFK,Id_FacturaFK) values (?,?,?,?,?)");
            // parametros de inicio para agregar...
            preparedStatement.setInt(1, newclClienteJc.getAncho());
           preparedStatement.setInt(1, newclClienteJc.getAlto());
            preparedStatement.setInt(1, newclClienteJc.getprecio());
            preparedStatement.setInt(4, newclClienteJc.getCantidad());
            preparedStatement.setInt(5, newclClienteJc.getIdFKCotizacion());
            preparedStatement.setInt(1, newclClienteJc.getIdFKCotizacionFactuta());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteProducto(int productoid) {
        try {
            System.out.println("Entro a eliminar");
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from ProductoBD where Id_Producto=?");
            // Parameters start with 1
            preparedStatement.setInt(1, productoid);
            preparedStatement.executeUpdate();
            System.out.println("Elimino El  Esquema");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCliente(ProductoJc newclClienteJc, int cs) {
        try {
            /// sentencia para insertar en la tabla
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update ProductoBD set ancho=?, alto=?, precio=?, cantidad=?, id_cotizacion=?, Id_FacturaFK where Id_producto=" + cs);
            // parametros de inicio para actualizar...
            preparedStatement.setInt(1, newclClienteJc.getAlto());
            preparedStatement.setInt(2, newclClienteJc.getAncho());
            preparedStatement.setInt(3, newclClienteJc.getCantidad());
            preparedStatement.setInt(4, newclClienteJc.getGrosor());
           
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
              //  newclClienteJc.setor(rs.getInt("Id_Producto"));
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

