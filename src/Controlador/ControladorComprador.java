/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import modelo.*;
/**
 *
 * @author Tiago
 */
public class ControladorComprador {
    
    public boolean CadastrarComprador(String cnpjcpf, String nome, 
                 String razãoSocial, String cep, String telefone, String limiteTransf, String senha){
        if( nome.length() > 0 && nome != null && 
                cnpjcpf != null && cnpjcpf.length() > 0 && razãoSocial != null && razãoSocial.length() > 0 &&
                cep != null && cep.length() > 0 && telefone != null && telefone.length() > 0 &&
                senha != null && senha.length() > 0
           )
            
        {
            
         Comprador usuario = new Comprador(cnpjcpf, nome, razãoSocial, cep, telefone, senha);
         usuario.Cadastrar(usuario);
         return true;
        }
        
        return false;
    }
    
}
