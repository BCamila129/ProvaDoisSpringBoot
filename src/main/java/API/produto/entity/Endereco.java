package API.produto.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String endereco;
    private String cep;
    private String numero;
    private String formaPagamento;
    private Integer parcelas;
    private Double valorTotal;
    private String itens;
    @ManyToMany(cascade = CascadeType.ALL)
    List<Produto> produtoList;

    public Endereco(){

    }

    public Endereco(String endereco, String cep, String numero, String formaPagamento, Integer parcelas, Double valorTotal, String itens) {
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
        this.valorTotal = valorTotal;
        this.itens = itens;

    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }
}
