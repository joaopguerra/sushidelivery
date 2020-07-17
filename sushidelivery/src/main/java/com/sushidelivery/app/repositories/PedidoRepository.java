package com.sushidelivery.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sushidelivery.app.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
