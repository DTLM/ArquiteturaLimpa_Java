package com.backend.atividade5cleanarchtecture.service;

import com.backend.atividade5cleanarchtecture.modal.Oferta;
import com.backend.atividade5cleanarchtecture.repository.OfertaRepository;

public class OfertaService {

	private OfertaRepository repo;
	
	public void save(Oferta oferta) {
		repo.save(oferta);
	}
}
