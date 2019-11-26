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
    
    public boolean cadastrarProduto( Integer codigo,String nome,String Descrição,double preço,int quantidade){
        
        
       
        if(codigo != null && nome.length() > 0 && nome != null && 
           Descrição != null && Descrição.length() > 0 && preço > 0 && quantidade > 0)
        {
            
         Produto produto = new Produto(nome,Descrição,quantidade);
         produto.Cadastrar(produto);
         return true;
        }
        
        
        
        
        return false;
    }
    
}
