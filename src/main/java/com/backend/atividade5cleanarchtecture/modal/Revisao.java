package com.backend.atividade5cleanarchtecture.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Revisao {

	private String nomeCliente;
	private String revisao;
	private Long id;
	private Livro livro;
	
	public Revisao criarRevisao(String nomeCliente, String revisao, Livro livro) {
		return Revisao.builder().nomeCliente(nomeCliente).revisao(revisao).livro(livro).build();
	}
}