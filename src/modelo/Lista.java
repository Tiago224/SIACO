/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Tiago
 */
public class Lista {
    
    private Comprador criador;
    private int codigo;
    private String nome;
    private Date datacriação;
    private ArrayList<Produto> produto = new ArrayList<Produto>();

    public Comprador getCriador() {
        return criador;
    }

    public void setCriador(Comprador criador) {
        this.criador = criador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatacriação() {
        return datacriação;
    }

    public void setDatacriação(Date datacriação) {
        this.datacriação = datacriação;
    }

    
    
}
