package com.almirjr94.cursomc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.almirjr94.cursomc.domain.Pedido;
import com.almirjr94.cursomc.repository.PedidoRepository;
import com.almirjr94.cursomc.service.exception.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	public Pedido find(Integer id) {
		return pedidoRepository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: "+ id + ", Tipo: "+Pedido.class.getName()));
	}

}
