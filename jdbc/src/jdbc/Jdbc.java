/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alumno
 */
public class Jdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        
        Class.forName("org.postgresql.Driver");
Connection connection = null;
connection = DriverManager.getConnection(
	"jdbc:oracle:thin:@localhost:3306:banco","banco","banco");
connection.close();
    }
}
