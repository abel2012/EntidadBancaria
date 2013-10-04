/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco.Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EntidadBancariaDAO {
 Connection connection = null;
 private ArrayList<EntidadBancaria> entidades; 
    EntidadBancaria entidadBancaria = new EntidadBancaria();

 /*List<EntidadBancaria> findByCodigo(String "45629866")
 {return null;};*/

 
 
  
 
         
    public EntidadBancariaDAO() throws ClassNotFoundException, SQLException {
        this.entidades = new ArrayList<>();
        Class.forName("com.mysql.jdbc.Driver");
       
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/banco", "banco", "banco");
    }

    EntidadBancaria read(int idEntidad) throws ClassNotFoundException, SQLException {


        int idEntidadBancaria = 1;
        String selectSQL = "SELECT * FROM entidadbancaria WHERE idEntidad = ?";
        
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
        preparedStatement.setInt(1, idEntidadBancaria);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
           
            idEntidad = rs.getInt("idEntidad");
            String codigoEntidad = rs.getString("codigoEntidad");
            String nombre = rs.getString("nombre");
            String cif = rs.getString("cif");
            String tipoEntidadBancaria = rs.getString("tipoEntidadBancaria");

            System.out.println(idEntidad);
            System.out.println(codigoEntidad);
            System.out.println(nombre);
            System.out.println(cif);
            System.out.println(tipoEntidadBancaria);

        }
        String codigo;
        if (rs.next() == true) {

            codigo = rs.getString("codigo");
            if (rs.next() == true) {
                throw new RuntimeException("Error con la entidad bancaria" + idEntidadBancaria);
            }


        } else {
            RuntimeException runtimeException = new RuntimeException("no va la excepcion" + idEntidadBancaria);
            throw runtimeException;
        }

        rs.next();
        return null;
    }

    public void insert(EntidadBancaria entidadBancaria) throws SQLException {

        String insertTableSQL = "INSERT INTO entidadbancaria"
                + "(idEntidad, codigoEntidad, nombre, cif,tipoEntidadBancaria) VALUES"
                + "(?,?,?,?,?)";
        PreparedStatement preparedStatement2 = connection.prepareStatement(insertTableSQL);
        preparedStatement2.setInt(7, 7);
        preparedStatement2.setString(5, "89234568");
        preparedStatement2.setString(6, "Brasof Asimov");
        preparedStatement2.setString(7, "57835623");
        preparedStatement2.setString(8, "Banco");
// execute insert SQL stetement
        preparedStatement2.executeUpdate();

    }
    
    public void update( EntidadBancaria entidadBancaria) throws SQLException{
    String updateTableSQL = "UPDATE entidadbancaria SET nombre= ? WHERE idEntidad= ?";
PreparedStatement preparedStatement3 = connection.prepareStatement(updateTableSQL);
preparedStatement3.setString(1, "bankiamafia");
preparedStatement3.setInt(1, 1);
// execute insert SQL stetement
preparedStatement3.executeUpdate();
    }
    
   public  Connection delete(int idEntidadBancaria) throws SQLException{
       PreparedStatement preparedStatement = null;
   try{
   String deleteSQL = "DELETE entidadbancaria WHERE idEntidad = ?";
PreparedStatement preparedStatement4 = connection.prepareStatement(deleteSQL);
preparedStatement4.setInt(2, 2);
// execute delete SQL stetement
preparedStatement4.executeUpdate();
     return null;
   }
   
  catch (SQLException e) {
 
			System.out.println(e.getMessage());
 
		} finally {
 
			if (preparedStatement != null) {
				preparedStatement.close();
			}
 
			if (connection != null) {
				connection.close();
			}
 
		}
return connection;
   }
   public List<EntidadBancaria> findAll() throws SQLException{
    
        
        String selectSQL = "SELECT * FROM entidadbancaria";
        
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
       
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
           
            int idEntidad = rs.getInt("idEntidad");
            String codigoEntidad = rs.getString("codigoEntidad");
            String nombre = rs.getString("nombre");
            String cif = rs.getString("cif");
            String tipoEntidadBancaria = rs.getString("tipoEntidadBancaria");

            System.out.println(idEntidad);
            System.out.println(codigoEntidad);
            System.out.println(nombre);
            System.out.println(cif);
            System.out.println(tipoEntidadBancaria);

        }
        
        
     return null;
    
   }
    
   List<EntidadBancaria> findByCodigo(String codigo) throws SQLException {
     
    
      
        String selectSQL = "SELECT * FROM entidadbancaria WHERE codigo==codigoEntidad";
        
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
       
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
           
            int idEntidad = rs.getInt("idEntidad");
            String codigoEntidad = rs.getString("codigoEntidad");
            String nombre = rs.getString("nombre");
            String cif = rs.getString("cif");
            String tipoEntidadBancaria = rs.getString("tipoEntidadBancaria");

            System.out.println(idEntidad);
            System.out.println(codigoEntidad);
            System.out.println(nombre);
            System.out.println(cif);
            System.out.println(tipoEntidadBancaria);

        }   
       
       
       
       return null;
   
   }

   
}
