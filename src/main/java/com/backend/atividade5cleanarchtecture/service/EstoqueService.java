package com.backend.atividade5cleanarchtecture.service;

import com.backend.atividade5cleanarchtecture.modal.Estoque;
import com.backend.atividade5cleanarchtecture.repository.EstoqueRepository;

public class EstoqueService {

	private EstoqueRepository repo;
	
	public void save(Estoque estoque) {
		repo.save(estoque);
	}
}
