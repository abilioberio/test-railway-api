package br.eti.abiliobrio.testes.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.eti.abiliobrio.testes.domain.model.EntityTabela1;
import br.eti.abiliobrio.testes.repository.EntityTabela1Repository;

@Service
public class EntityTabela1Service {
	
	@Autowired
	EntityTabela1Repository entityTabela1Repository;
	
	public EntityTabela1 incluir(EntityTabela1 tabela1) {
		return entityTabela1Repository.save(tabela1);
	}
	
	public List<EntityTabela1> listar(){
		return ((Collection<EntityTabela1>) entityTabela1Repository.findAll())
				.stream()
				.collect(Collectors.toList());
	}

}
