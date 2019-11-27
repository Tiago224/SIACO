/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Tiago
 */
public class Lista {
    
    private Comprador criador;
    private int codigo;
    private String nome;
    private SimpleDateFormat datacriação;
    private ArrayList<Produto> produto = new ArrayList<Produto>();

    public Lista(String nome) {
        this.criador = criador;
        this.codigo = codigo;
        this.nome = nome;
        this.datacriação = datacriação;
    }
    
    

    public Comprador getCriador() {
        return criador;
    }

    public void setCriador(Comprador criador) {
        this.criador = criador;
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
        String codigoformatado = "L" +(char)codigo;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SimpleDateFormat getDatacriação() {
        return datacriação;
    }

    public void setDatacriação(SimpleDateFormat datacriaçãolocal) {
        Date hoje = new Date();
        SimpleDateFormat df;
        df = new SimpleDateFormat("dd/MM/yyyy");
        df.format(hoje);
        this.datacriação = df;
    }

    public void Cadastrar(Lista lista){
        
   }
    
}
