package io.restaurante.core;

import java.util.ArrayList;
import java.util.List;

public class Garcom {
	public enum TipoPedido{
		PENDENTE, COZINHA, ENTREGAR
	}
	
	private List<Pedido> pedidos = new ArrayList<>();

	public void adicionaPedido(Pedido pedido, TipoPedido tipoPedido) {
		pedidos.add(pedido);
	}
	
	public List<Pedido> getPedidoCozinha() {
		return pedidos;
	}

	public void entregaPedido(Cozinha cozinha) {
		
		String nome = cozinha.getPedido().getNome();
		String nomeCliente = cozinha.getPedido().getCliente().getNome();
		int quantidade = cozinha.getPedido().getQuantidade();
		int mesa = cozinha.getPedido().getCliente().getMesa();
		
		System.out.println("Resultado da entrega: " + nome + " quantidade: " + quantidade + "\nInformações do Cliente: " + nomeCliente + " Mesa do Pedido: "  + mesa);
	}
	
	

}
