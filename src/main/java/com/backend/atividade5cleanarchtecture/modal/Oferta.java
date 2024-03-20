package com.backend.atividade5cleanarchtecture.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Oferta {

	private String vendedor;
	private Double preco;
	private Long id;
	private Livro livro;
	
	public Oferta criarOferta(String vendedor, Double preco, Livro livro) {
		return Oferta.builder().vendedor(vendedor).preco(preco).livro(livro).build();
	}
}
