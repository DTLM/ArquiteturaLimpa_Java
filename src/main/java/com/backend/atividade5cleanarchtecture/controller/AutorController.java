package com.backend.atividade5cleanarchtecture.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.backend.atividade5cleanarchtecture.modal.Autor;
import com.backend.atividade5cleanarchtecture.service.AutorService;

public class AutorController {

	private AutorService service;
	
	public ResponseEntity save(Autor autor) {
		service.save(autor);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
