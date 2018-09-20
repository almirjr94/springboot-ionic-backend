package com.almirjr94.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.almirjr94.cursomc.domain.enums.EstadoPagamento;

@SuppressWarnings("serial")
@Entity
public class PagamentoComBoleto extends Pagamento {

	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {}

	public PagamentoComBoleto(EstadoPagamento estado, Pedido pedido,Date dataVencimento, Date dataPagamento) {
		super(estado, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	
	
	
}
