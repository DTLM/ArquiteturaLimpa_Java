package com.backend.atividade5cleanarchtecture.service;

import com.backend.atividade5cleanarchtecture.modal.Revisao;
import com.backend.atividade5cleanarchtecture.repository.RevisaoRepository;

public class RevisaoService {

	private RevisaoRepository repo;
	
	public void save(Revisao revisao) {
		repo.save(revisao);
	}
}
