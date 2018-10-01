package com.almirjr94.cursomc.domain;

import javax.persistence.Entity;

import com.almirjr94.cursomc.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonTypeName;

@SuppressWarnings("serial")
@Entity
@JsonTypeName("pagamentoComCartao")
public class PagamentoComCartao extends Pagamento {

	private Integer numeroDeParcelas;
	
	public PagamentoComCartao(){}

	public PagamentoComCartao(EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
	
	
}
