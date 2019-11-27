/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexão;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Tiago
 */
public class conexão {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";  
    private static final String URL = "sql159.main-hosting.eu";
    private static final String USER = "u238613843_admsiaco";
    private static final String PASS = "15221117";
    
    public static Connection getConnection(){
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(conexão.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(conexão.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return DriverManager.getConnection(URL, USER,PASS);
        } catch (ClassNotFoundException | SQLException ex) {
           throw new RuntimeException("Error na conexão ",ex);
        } 
    }
    
    
     public static void closeConnection(Connection con){
        if(con != null){
            try {    
                con.close();
            } catch (SQLException ex) {
                System.err.println("Error:" +ex);
            }   
        }  
    
    }
     
      public static void closeConnection(Connection con,PreparedStatement stmt){
        if(stmt != null){
            try {    
                con.close();
            } catch (SQLException ex) {
                System.err.println("Error:" +ex);
            }   
        }
        
          closeConnection(con);
    }
      public static void closeConnection(Connection con,PreparedStatement stmt, ResultSet rs){
        if(rs != null){
            try {    
                rs.close();
            } catch (SQLException ex) {
                 System.err.println("Error:" +ex);
            }   
        }
        
          closeConnection(con,stmt);
    }
      
      
      
      
}