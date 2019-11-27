/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistência;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import Conexão.*;
import java.util.logging.Logger;
import modelo.*;

/**
 *
 * @author Tiago
 */
public class ProdutoDAO{ 
        Connection con;
        PreparedStatement stmt;
        
        public ProdutoDAO(){
            con = conexão.getConnection();
            if(con != null){
                System.out.println("Conexão Feita");
            }
        
        }
        
        public void inserir(Produto novo){
            try {
                stmt = con.prepareStatement("insert into Produto(codigo,nome) values (?,?)");
                
                stmt.setInt(1,novo.getCodigo());
                stmt.setInt(5,novo.getQuantidade());
                
                stmt.execute();
         
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public void alterar(){
        }
        
        public void excluir(){
        }
       
}   
