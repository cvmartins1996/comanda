package io.restaurante.core;

public class Pedido {

	private String nome;
	private Cliente cliente;

	public Pedido(String nome) {
		this.nome = nome;
	}

	public int setQuantidade(int quantidade) {
		return quantidade;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
