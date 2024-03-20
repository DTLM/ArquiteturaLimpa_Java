package com.backend.atividade5cleanarchtecture.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.backend.atividade5cleanarchtecture.modal.Estoque;
import com.backend.atividade5cleanarchtecture.service.EstoqueService;

public class EstoqueController {

	private EstoqueService service;
	
	public ResponseEntity save(Estoque estoque) {
		service.save(estoque);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
