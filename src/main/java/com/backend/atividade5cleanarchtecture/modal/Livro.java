package com.backend.atividade5cleanarchtecture.modal;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Livro {

	private Long id;
	private String titulo;
	private String isbn;
	private String dirFoto;
	private Set<Autor> autores;
	
	public Livro criarLivro(String titulo, String isbn, String dirFoto,Set<Autor> autores) {
		return Livro.builder().titulo(titulo).isbn(isbn).dirFoto(dirFoto).autores(autores).build();
	}
	public void adicionarEditarAutor(Autor autor) {
		if (this.autores != null) {
			Optional<Autor> aux = autores.stream().filter(a -> a.getNome().equalsIgnoreCase(autor.getNome())).findAny();
			if (aux != null && aux.isPresent()) {
				autores.remove(aux.get());
			}
			autores.add(autor);
		} else {
			this.autores = new HashSet<>();
			autores.add(autor);
		}
	}

	public void removerAutor(String nome) {
		if (this.autores != null) {
			Optional<Autor> autorAux = this.autores.stream().filter(autor -> autor.getNome().equalsIgnoreCase(nome))
					.findAny();
			if (autorAux != null && autorAux.isPresent()) {
				autores.remove(autorAux.get());
			}
		}
	}
}