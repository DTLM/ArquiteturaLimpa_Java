package com.backend.atividade5cleanarchtecture.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Estoque{

	private Long id;
	private Livro livro;
	private Integer quantidade;
	
	public void exibirEstoque() {
		System.out.println("quantidade em estoque: " + this.quantidade);
	}
	
	public void adicionarEstoque(Integer quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerEstoque(Integer quantidade) {
		if(this.quantidade - quantidade < 0) {
			System.out.println("Quantidade de livros em estoque insuficiente para serem removidos, quantidade: " + this.quantidade);
		} else {
			this.quantidade -= quantidade;
		}
	}

}