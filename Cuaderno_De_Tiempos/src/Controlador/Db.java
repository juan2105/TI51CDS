/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Conta
 */
public class Db {
    com.mysql.jdbc.Connection con = null;
    String host;
    String database; 
    String username;
    String password;
    
    
    public Db(){
       host = "localhost";
       database = "cuaderno";
       username = "root";
       password = "";
    }
    
    public com.mysql.jdbc.Connection conexion() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://"+host+"/"+database,username,password);
            System.out.println("Conexión establecida");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de conexión");
            Logger.getLogger(Db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
