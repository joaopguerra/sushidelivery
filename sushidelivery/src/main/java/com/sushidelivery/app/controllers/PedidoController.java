package com.sushidelivery.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sushidelivery.app.entities.Pedido;
import com.sushidelivery.app.repositories.PedidoRepository;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoRepository repo;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> findAll() {
		List<Pedido> obj = repo.findAll();
		return ResponseEntity.ok().body(obj);
	}

}
