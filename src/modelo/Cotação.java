package modelo;
import java.util.ArrayList;
import java.util.Date;

public class Cotação {
    private Integer condigo;
    private Date datainicio;
    private Date datatermino;
    private ArrayList<Lista> lista = new ArrayList<Lista>();
    private Comprador comprador;
    private Fornecedor fornecedor;

    public int getCondigo() {
        return condigo;
    }

    public void setCondigo(int condigo) {
        this.condigo = condigo;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public Date getDatatermino() {
        return datatermino;
    }

    public void setDatatermino(Date datatermino) {
        this.datatermino = datatermino;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
    
    
        
}
