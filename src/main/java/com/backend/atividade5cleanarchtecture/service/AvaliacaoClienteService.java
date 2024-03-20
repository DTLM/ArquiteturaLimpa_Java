package com.backend.atividade5cleanarchtecture.service;

import com.backend.atividade5cleanarchtecture.modal.AvaliacaoCliente;
import com.backend.atividade5cleanarchtecture.repository.AvaliacaoClienteRepository;

public class AvaliacaoClienteService {

	private AvaliacaoClienteRepository repo;
	
	public void save(AvaliacaoCliente avaliacaoCliente) {
		repo.save(avaliacaoCliente);
	}
}
