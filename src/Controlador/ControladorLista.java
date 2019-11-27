/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.Date;
import modelo.*;

/**
 *
 * @author Tiago
 */
public class ControladorLista {
    
        public boolean cadastrarLista(String nome){
       
        if( nome.length() > 0 && nome != null)
        {
            
         Lista lista = new Lista(nome);
         lista.Cadastrar(lista);
         return true;
        }
        
        return false;
    }
    
}
