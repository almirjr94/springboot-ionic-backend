package com.almirjr94.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.almirjr94.cursomc.domain.Cliente;
import com.almirjr94.cursomc.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente>find(@PathVariable("id") Integer id){
		return ResponseEntity.ok(clienteService.find(id));
	}

}
