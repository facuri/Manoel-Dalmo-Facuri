package curso.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import curso.springboot.model.Cliente;

@Repository
@Transactional//Persistência como Banco de Dados
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
