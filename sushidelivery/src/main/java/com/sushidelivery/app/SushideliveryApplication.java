package com.sushidelivery.app;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sushidelivery.app.entities.Cliente;
import com.sushidelivery.app.entities.Motoqueiro;
import com.sushidelivery.app.entities.Pedido;
import com.sushidelivery.app.entities.Produto;
import com.sushidelivery.app.repositories.ClienteRepository;
import com.sushidelivery.app.repositories.MotoqueiroRepository;
import com.sushidelivery.app.repositories.PedidoRepository;
import com.sushidelivery.app.repositories.ProdutoRepository;

@SpringBootApplication
public class SushideliveryApplication implements CommandLineRunner {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private MotoqueiroRepository motoqueiroRepository;

	public static void main(String[] args) {
		SpringApplication.run(SushideliveryApplication.class, args);
	}

	public void run(String... args) throws Exception {
		
		Produto prod1 = new Produto(null, "Sushi hot, 16pcs", 25.00);
		Produto prod2 = new Produto(null, "Temaki normal", 20.00);
		Produto prod3 = new Produto(null, "Rolinho primavera, 2 unds", 8.00);
		
		produtoRepository.saveAll(Arrays.asList(prod1, prod2, prod3));
		
		Pedido p1 = new Pedido(null, prod1, 2, 654, "12345678", prod1.getValor());
		Pedido p2 = new Pedido(null, prod2, 3, 654, "12345678", prod2.getValor());
		Pedido p3 = new Pedido(null, prod3, 1, 654, "12345678", prod3.getValor());
		Pedido p4 = new Pedido(null, prod1, 5, 654, "123456789", prod1.getValor());
		
		pedidoRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
		
		Cliente c1 = new Cliente("85 9999-1010", "João", "Rua Vicente Spíndola", "Nº10000","Vila União","Fortaleza","CE");
		Cliente c2 = new Cliente("85 9999-8888", "Maria", "Rua Mario Mamede", "Nº1200","Fátima","Fortaleza","CE");
		
		clienteRepository.saveAll(Arrays.asList(c1,c2));
		
		Motoqueiro m1 = new Motoqueiro(null,"Fábio","8888-3344");
		
		motoqueiroRepository.saveAll(Arrays.asList(m1));
	}

}
