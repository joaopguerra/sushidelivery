package com.sushidelivery.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sushidelivery.app.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
