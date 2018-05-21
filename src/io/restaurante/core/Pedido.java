package io.restaurante.core;

public class Pedido {

	private String nome;
	private Cliente cliente;
	private int quantidade;

	public Pedido(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

}
