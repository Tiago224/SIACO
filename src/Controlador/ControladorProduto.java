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
public class ControladorProduto {
    
    public boolean cadastrarProduto( String nome,String Descrição,int quantidade){
       
        if( nome.length() > 0 && nome != null && 
           Descrição != null && Descrição.length() > 0 && quantidade > 0)
        {
            
         Produto produto = new Produto(nome,Descrição,quantidade);
         produto.Cadastrar(produto);
         return true;
        }
        
        return false;
    }
    
}
