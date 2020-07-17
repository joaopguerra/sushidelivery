package com.sushidelivery.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sushidelivery.app.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
