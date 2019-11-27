/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Tiago
 */
public class Comprador {
    
    private String cnpjcpf;
    private String nome;
    private String razãoSocial;
    private String cep;
    private String telefone;
    private int limiteTransf;// Ignora esse aqui
    private String senha;

    public Comprador(String cnpjcpf, String nome, String razãoSocial, String cep, String telefone, String senha) {
        this.cnpjcpf = cnpjcpf;
        this.nome = nome;
        this.razãoSocial = razãoSocial;
        this.cep = cep;
        this.telefone = telefone;
        this.limiteTransf = 6;
        this.senha = senha;
    }
    

    public String getCnpjcpf() {
        return cnpjcpf;
    }

    public void setCnpjcpf(String cnpjcpf) {
        this.cnpjcpf = cnpjcpf;
    }

    public String getRazãoSocial() {
        return razãoSocial;
    }

    public void setRazãoSocial(String razãoSocial) {
        this.razãoSocial = razãoSocial;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getLimiteTransf() {
        return limiteTransf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public void Cadastrar(Comprador usuario){
        
    }
    
    
}
