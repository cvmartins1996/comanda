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
	
	

}
