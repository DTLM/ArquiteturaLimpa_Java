package com.backend.atividade5cleanarchtecture.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.backend.atividade5cleanarchtecture.modal.Livro;
import com.backend.atividade5cleanarchtecture.service.LivroService;

public class LivroController {

	private LivroService service;
	
	public ResponseEntity save(Livro livro) {
		service.save(livro);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
