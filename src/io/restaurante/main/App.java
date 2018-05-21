package io.restaurante.main;

import io.restaurante.core.Cliente;
import io.restaurante.core.Cozinha;
import io.restaurante.core.Garcom;
import io.restaurante.core.Pedido;
import io.restaurante.core.Garcom.TipoPedido;

/**
 * 
 * @author cvmar
 * App com o objetivo de facilitar o controle de pedidos de um restaurante
 * dada a entrada de um pedido, exibi-lo aos conzinheiros o que deve ser feito e a quantidade,
 * Ao garçom ter sempre o controle da mesa de onde veio o pedido
 * Ao garcom fica o dever ter abrir a plataforma para os pedidos
 */

public class App {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "martins");
		Garcom garcom = new Garcom();
		int quantidade = 2;
		Pedido pedido = new Pedido("prato do dia", quantidade);
		pedido.setCliente(cliente);
		garcom.adicionaPedido(pedido, TipoPedido.PENDENTE);
		
		Cozinha cozinha = new Cozinha(pedido, TipoPedido.COZINHA);
		
		
		garcom.entregaPedido(cozinha);
		
		
		
	}
}
