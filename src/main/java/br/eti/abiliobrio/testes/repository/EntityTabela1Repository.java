package br.eti.abiliobrio.testes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.eti.abiliobrio.testes.domain.model.EntityTabela1;

@Repository
public interface EntityTabela1Repository extends CrudRepository<EntityTabela1, Long> {

}
