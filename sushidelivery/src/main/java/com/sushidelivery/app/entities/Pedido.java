package com.sushidelivery.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	
	@JoinColumn(name = "produto_id")
	@ManyToOne	
	private Produto produtoId;
	private Integer quantidade;	
	private Integer motoqueiroId;
	private String telCliente;
	private Double valor;
	
	public Pedido() {
	}

	public Pedido(Integer id, Produto produtoId, Integer quantidade, Integer motoqueiroId, String telCliente,
			Double valor) {
		super();
		this.id = id;
		this.produtoId = produtoId;
		this.quantidade = quantidade;
		this.motoqueiroId = motoqueiroId;
		this.telCliente = telCliente;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produto getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Produto produtoId) {
		this.produtoId = produtoId;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getMotoqueiroId() {
		return motoqueiroId;
	}

	public void setMotoqueiroId(Integer motoqueiroId) {
		this.motoqueiroId = motoqueiroId;
	}

	public String getTelCliente() {
		return telCliente;
	}

	public void setTelCliente(String telCliente) {
		this.telCliente = telCliente;
	}

	public Double getValor() {
		return valor;
	}

	public Double getValorTotal() {
		double valorTotal = valor * quantidade;
		return valorTotal;
	}
}
