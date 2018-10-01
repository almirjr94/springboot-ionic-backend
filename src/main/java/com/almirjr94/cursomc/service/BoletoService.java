package com.almirjr94.cursomc.service;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.almirjr94.cursomc.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	public void preencherPagamentoComBoleto(PagamentoComBoleto boleto, Date instanteDoPedido) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(instanteDoPedido);
		calendar.add(Calendar.DAY_OF_MONTH,7);
		boleto.setDataPagamento(calendar.getTime());
	}
	
}
