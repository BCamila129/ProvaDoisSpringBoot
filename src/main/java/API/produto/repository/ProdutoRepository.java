package API.produto.repository;

import API.produto.entity.Cliente;
import API.produto.entity.Endereco;
import API.produto.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Endereco, String> {
}
