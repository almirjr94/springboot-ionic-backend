package com.almirjr94.cursomc.resources;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.almirjr94.cursomc.domain.Pedido;
import com.almirjr94.cursomc.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoResources {
	
	@Autowired
	private PedidoService pedidoService;

	@GetMapping("/{id}")
	public ResponseEntity<Pedido> listar(@PathVariable("id") Integer id) {
		return ResponseEntity.ok().body(pedidoService.find(id));
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@Valid @RequestBody Pedido pedido) {
		pedido = pedidoService.insert(pedido);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pedido.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
	
}
