/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistência;

import Conexão.conexão;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

/**
 *
 * @author Tiago
 */
public class CompradorDAO {
    
    Connection con;
        PreparedStatement stmt;
        
        public CompradorDAO(){
            con = conexão.getConnection();
            if(con != null){
                System.out.println("Conexão Feita");
            }
        
        }
        
        public void inserir(Comprador novo){
            try {
                stmt = con.prepareStatement("insert into Comprador((cnpjcpf, nome, razãoSocial, cep, telefone, senha) values (?,?,?,?,?,?)");
                stmt.setString(1,novo.getCep());
                stmt.setString(2,novo.getCnpjcpf());
                stmt.setInt(3,novo.getLimiteTransf());
                stmt.setString(6,novo.getRazãoSocial());
                stmt.setString(7,novo.getSenha());
                stmt.setString(8,novo.getTelefone());
                
                stmt.execute();
         
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    
}
