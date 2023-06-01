package br.eti.abiliobrio.testes.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.eti.abiliobrio.testes.domain.model.EntityTabela1;
import br.eti.abiliobrio.testes.service.EntityTabela1Service;

@RestController
@RequestMapping(value="/api")
public class EntityTabela1Resource {

	@Autowired
	private EntityTabela1Service entityTabela1Service;
	
	@PostMapping("/incluir")
	public EntityTabela1 incluir(@RequestBody EntityTabela1 tabela1) {
		
		EntityTabela1 tabela = entityTabela1Service.incluir(tabela1);
		System.out.println(tabela.toString());
		
		return tabela;
	}
	
	@GetMapping("/listar")
	public List<EntityTabela1> listar(){
		
		List<EntityTabela1> lista = entityTabela1Service.listar();
		System.out.println(lista);
		
		return lista;
	}
}
