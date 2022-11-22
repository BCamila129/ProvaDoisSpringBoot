package API.produto.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeCompleto;
    @ManyToMany (cascade = CascadeType.ALL)
    private List<Produto> produtoList;

   public Cliente(){

    }

    public Cliente(String nomeCompleto,List<Produto> produtoList) {
        this.nomeCompleto = nomeCompleto;
        this.produtoList = produtoList;
    }


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }
}
