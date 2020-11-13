package curso.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import curso.springboot.model.Pessoa;

@Repository
@Transactional//Persistência como Banco de Dados
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

}
