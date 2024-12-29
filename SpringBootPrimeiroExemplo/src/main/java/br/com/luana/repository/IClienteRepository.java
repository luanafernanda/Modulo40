
package br.com.luana.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.luana.domain.Cliente;


@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}