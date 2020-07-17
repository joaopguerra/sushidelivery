package com.sushidelivery.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sushidelivery.app.entities.Produto;
import com.sushidelivery.app.repositories.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repo;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		List<Produto> obj = repo.findAll();
		return ResponseEntity.ok().body(obj);
	}

}
