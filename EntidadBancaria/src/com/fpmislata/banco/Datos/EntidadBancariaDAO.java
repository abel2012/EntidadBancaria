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
 Connection connection = null;
    public EntidadBancariaDAO() throws ClassNotFoundException, SQLException {
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
            String userid = rs.getString("USER_ID");
            String username = rs.getString("USERNAME");

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
        preparedStatement2.setInt(4, 4);
        preparedStatement2.setString(5, "13672470");
        preparedStatement2.setString(6, "Ruralcaja");
        preparedStatement2.setString(7, "14562345");
        preparedStatement2.setString(8, "Banco");
// execute insert SQL stetement
        preparedStatement2.executeUpdate();

    }

    connection.close();
}
