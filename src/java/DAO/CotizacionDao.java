/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dato.ClienteJc;
import Dato.CotizacionJc;
import Servicios.DbUtil;
import java.sql.Connection;
import java.sql.Date;
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
public class CotizacionDao {
      private Connection connection;

    public CotizacionDao() {
        connection = DbUtil.getConnection();
    }

    public void addCotizacion(CotizacionJc newCotizacionJc) {
        try {
            /// sentencia para insertar en la tabla
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into CotizacionBD(Fecha,Id_ClienteFK) values (?,?)");
            // parametros de inicio para agregar...
            preparedStatement.setDate(1, (Date) newCotizacionJc.getFechaCotizacion());
            preparedStatement.setInt(2, newCotizacionJc.getIdFKCliente());
          
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCotizacion(int cotizacionID) {
        try {
            System.out.println("Entro a eliminar");
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from CotizacionBD where Id_Cotización=?");
            // Parameters start with 1
            preparedStatement.setInt(1,cotizacionID);
            preparedStatement.executeUpdate();
            System.out.println("Elimino El  Esquema");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCliente(CotizacionJc newCotizacionJc, int cs) {
        try {
            /// sentencia para insertar en la tabla
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update CotizacionBD set Fecha=?, Id_ClienteFK=?" + cs);
            // parametros de inicio para actualizar...
            preparedStatement.setDate(1, (Date) newCotizacionJc.getFechaCotizacion());
            preparedStatement.setInt(2, newCotizacionJc.getIdFKCliente());
            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<CotizacionJc> getAllCotizaciones() {
        List<CotizacionJc> cotizacionListas = new ArrayList<CotizacionJc>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from CotizacionBD");
            while (rs.next()) {
                CotizacionJc newCotizacionJc = new CotizacionJc();
                newCotizacionJc.setOtizacionProductoID(rs.getInt("Id_Cotización"));
                newCotizacionJc.setFechaCotizacion(rs.getDate("Fecha"));
                newCotizacionJc.setIdFKCliente(rs.getInt("Id_ClienteFK"));
               

                cotizacionListas.add(newCotizacionJc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cotizacionListas;
    }

    

}
