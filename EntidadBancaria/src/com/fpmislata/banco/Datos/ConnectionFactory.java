/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco.Datos;

import java.sql.Connection;

/**
 *
 * @author alumno
 */
public interface ConnectionFactory {
    
    Connection getConnection();
}
