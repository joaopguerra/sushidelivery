package com.sushidelivery.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sushidelivery.app.entities.Motoqueiro;
import com.sushidelivery.app.repositories.MotoqueiroRepository;

@RestController
@RequestMapping("/motoqueiros")
public class MotoqueiroController {
		
		@Autowired
		private MotoqueiroRepository motoqueiroRepository;
		
		@GetMapping
		public ResponseEntity<List<Motoqueiro>> findAll() {
			List<Motoqueiro> obj = motoqueiroRepository.findAll();
			return ResponseEntity.ok().body(obj);
		}
}
