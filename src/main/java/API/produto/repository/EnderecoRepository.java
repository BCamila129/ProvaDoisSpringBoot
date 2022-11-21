package API.produto.repository;

import API.produto.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Cliente, Long> {
}
