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

/**
 *
 * @author alumno
 */
public class EntidadBancariaDAO {
    
    EntidadBancaria read(int idEntidad) throws ClassNotFoundException, SQLException{
         Class.forName("com.mysql.jdbc.Driver");
Connection connection = null;
connection = DriverManager.getConnection(
	"jdbc:mysql://localhost:3306/banco","banco","banco");
        
        int idEntidadBancaria=1;
        String selectSQL = "SELECT * FROM entidadbancaria WHERE idEntidad = ?";
PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
preparedStatement.setInt(1, idEntidadBancaria);
ResultSet rs = preparedStatement.executeQuery();
while (rs.next()) {
	String userid = rs.getString("USER_ID");
	String username = rs.getString("USERNAME");
        
        idEntidad  = rs.getInt("idEntidad");
	String codigoEntidad= rs.getString("codigoEntidad");
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
