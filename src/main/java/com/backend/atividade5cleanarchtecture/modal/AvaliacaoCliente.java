package com.backend.atividade5cleanarchtecture.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AvaliacaoCliente {

	private Long id;
	private Livro livro;
	private String nomeCliente;
	private Double nota;
	
	public AvaliacaoCliente avaliar(String nome, Double nota, Livro livro) {
		this.nomeCliente = nome;
		this.livro = livro;
		this.nota = nota;
		return AvaliacaoCliente.builder().nomeCliente(nome).nota(nota).livro(livro).build();
	}
	
	public void editarAvaliacao(String nome, Double nota, Livro livro) {
		this.nomeCliente = nome;
		this.nota = nota;
		this.livro = livro;
	}
}