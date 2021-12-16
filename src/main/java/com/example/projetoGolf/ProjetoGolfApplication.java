package com.example.projetoGolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoGolfApplication {

	public static void main(String[] args) {

		System.out.println("Inicializando a aplicação ProjetoGolf... ");
		SpringApplication.run(ProjetoGolfApplication.class, args);
		System.out.println("Aplicação ProjetoGolf inicializada... ");

	}

}
