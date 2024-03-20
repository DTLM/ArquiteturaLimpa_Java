package com.backend.atividade5cleanarchtecture.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.backend.atividade5cleanarchtecture.modal.AvaliacaoCliente;
import com.backend.atividade5cleanarchtecture.service.AvaliacaoClienteService;

public class AvaliacaoClienteController {

	private AvaliacaoClienteService service;
	
	public ResponseEntity save(AvaliacaoCliente avaliacaoCliente) {
		service.save(avaliacaoCliente);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
