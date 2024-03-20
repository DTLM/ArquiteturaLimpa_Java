package com.backend.atividade5cleanarchtecture.service;

import java.util.List;

import com.backend.atividade5cleanarchtecture.modal.Autor;
import com.backend.atividade5cleanarchtecture.modal.Livro;
import com.backend.atividade5cleanarchtecture.repository.AutorRepository;
import com.backend.atividade5cleanarchtecture.repository.LivroRepository;

public class AutorService {

	private AutorRepository repo;
	private LivroRepository livroRepo;
	private List<Livro> livros;
	
	public void getLivrosPorAutor(String nome) {
		livros = livroRepo.getLivrosPorAutor(nome);
	}
	
	public void save(Autor autor) {
		repo.save(autor);
	}
}
