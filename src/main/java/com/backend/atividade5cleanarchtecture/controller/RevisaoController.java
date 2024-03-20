package com.backend.atividade5cleanarchtecture.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.backend.atividade5cleanarchtecture.modal.Revisao;
import com.backend.atividade5cleanarchtecture.service.RevisaoService;

public class RevisaoController {

	private RevisaoService service;
	
	public ResponseEntity save(Revisao revisao) {
		service.save(revisao);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
