package io.restaurante.core;

import io.restaurante.core.Garcom.TipoPedido;

public class Cozinha {

	private Pedido pedido;
	private TipoPedido tipoPedido;
	
	public Cozinha(Pedido pedido, TipoPedido tipoPedido) {
		this.pedido = pedido;
		this.tipoPedido = tipoPedido;
	}
	
	public Pedido getPedido() {
		return pedido;
	}
	
	public TipoPedido getTipoPedido() {
		return tipoPedido;
	}
	
	

}
