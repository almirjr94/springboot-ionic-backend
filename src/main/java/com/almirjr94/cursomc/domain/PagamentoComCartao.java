package com.almirjr94.cursomc.domain;

import javax.persistence.Entity;

import com.almirjr94.cursomc.domain.enums.EstadoPagamento;

@SuppressWarnings("serial")
@Entity
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
