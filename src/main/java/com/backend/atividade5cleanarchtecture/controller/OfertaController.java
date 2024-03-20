package com.backend.atividade5cleanarchtecture.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.backend.atividade5cleanarchtecture.modal.Oferta;
import com.backend.atividade5cleanarchtecture.service.OfertaService;

public class OfertaController {

	private OfertaService service;
	
	public ResponseEntity save(Oferta oferta) {
		service.save(oferta);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
