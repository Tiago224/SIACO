/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;

/**
 *
 * @author Tiago
 */
public class Produto {
    
    private int codigo;
    private String nome;
    private String Descrição;
    private double preço;
    private int quantidade;

    public Produto( String nome, String Descrição, int quantidade) {
        
        this.nome = nome;
        this.Descrição = Descrição;
        this.quantidade = quantidade;
    }

    

    public int getCodigo() {
        return codigo;
    }

    public void gerarCodigo(int codigo) {
        Random n = new Random ();
        codigo = n.nextInt(1000);
        while(codigo < 0){
            gerarCodigo(codigo);
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String Descrição) {
        this.Descrição = Descrição;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        
        this.preço = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
        
    public void Cadastrar(Produto produto){
        
   }
    
  
}
