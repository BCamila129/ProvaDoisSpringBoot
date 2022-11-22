package API.produto.controller;

import API.produto.entity.Cliente;
import API.produto.entity.Endereco;
import API.produto.entity.Produto;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/pedido/v1/")

public class Controller {

    @Autowired
    Repository repository;

    @PostMapping
    @ResponseBody
    public Cliente create(@RequestBody Cliente cliente){
        for (Produto p : cliente.getProdutoList()){
            p.setPrecoTotal(p.getPrecoIndividual()*p.getQuantidade());
        }
        Cliente clienteSaved = repository.save(cliente);
        return clienteSaved;
    }
    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Cliente> getClienteById(@PathVariable Long id){
        Optional<Cliente> clienteOptional = repository.findById(id);
        return clienteOptional;
    }
    @DeleteMapping("{id}")
    public String deleteClienteById(@PathVariable Long id){
        Optional<Cliente> clienteOptional = repository.findById(id);
        if(clienteOptional.isPresent()){
            repository.deleteById(id);
            return "Cliente de id " + id + "foi deletado com sucesso0";
        }else{
            return "Cliente inexistente!";
        }
    }


    }

}
