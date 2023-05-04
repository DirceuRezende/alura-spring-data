package br.com.alura.spring.data.repository;

import br.com.alura.spring.data.orm.Funcionario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Integer>, CrudRepository<Funcionario, Integer> {
}
