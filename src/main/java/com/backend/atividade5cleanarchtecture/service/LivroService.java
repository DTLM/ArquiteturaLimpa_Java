package com.backend.atividade5cleanarchtecture.service;

import com.backend.atividade5cleanarchtecture.modal.Livro;
import com.backend.atividade5cleanarchtecture.repository.LivroRepository;

public class LivroService {

	private LivroRepository repo;
	
	public void save(Livro livro) {
		repo.save(livro);
	}
}
