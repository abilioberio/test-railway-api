package br.eti.abiliobrio.testes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestRailwayApiApplication {

	public String PORT = System.getenv("PORT");
	
	public static void main(String[] args) {
		SpringApplication.run(TestRailwayApiApplication.class, args);
	}

}
