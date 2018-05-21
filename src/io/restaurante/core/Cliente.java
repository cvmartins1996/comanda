package io.restaurante.core;

public class Cliente {

	private String nome;
	private int mesa;

	public Cliente(int mesa, String nome) {
		this.mesa = mesa;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getMesa() {
		return mesa;
	}

}
