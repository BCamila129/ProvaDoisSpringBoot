package API.produto.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeCompleto;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Endereco> enderecosList;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> produtoList;

   public Cliente(){

    }

    public Cliente(String nomeCompleto, List<Endereco> enderecosList, List<Produto> produtoList) {
        this.nomeCompleto = nomeCompleto;
        this.enderecosList = enderecosList;
        this.produtoList = produtoList;
    }

    public Long getId() {
        return id;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public List<Endereco> getEnderecosList() {
        return enderecosList;
    }

    public void setEnderecosList(List<Endereco> enderecosList) {
        this.enderecosList = enderecosList;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }
}
