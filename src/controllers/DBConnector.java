/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Moon-
 */
public class DBConnector {
    public Connection Connect(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url,User,Pass);
            //System.out.println("Conexion establecida");
            return conn;
        }catch(SQLException e){
            System.out.println("Conexion FALLIDA \n"+ e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    //String Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
<<<<<<< Updated upstream
    String User="sqlUsuario";
    String Pass="123456789";
    String url ="jdbc:sqlserver://DESKTOP-F5IOQT8\\Moon-:1433;databaseName=DBCovid";
=======
//    String User="sqlUsuario";
//    String Pass="123456789";
//    String url ="jdbc:sqlserver://DESKTOP-F5IOQT8\\Moon-:1433;databaseName=DBCovid";
    
    String User="sqlUsuario";
    String Pass="123456";
    String url ="jdbc:sqlserver://DESKTOP-BKMP60J\\micro:1433;databaseName=DBCovid";
>>>>>>> Stashed changes
}
