package com.almirjr94.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.almirjr94.cursomc.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaResources {
	
	@Autowired
	private CategoriaService categoriaService;

	@GetMapping("/{id}")
	public ResponseEntity<?> listar(@PathVariable("id") Integer id) {
		return ResponseEntity.ok().body(categoriaService.buscar(id));
	}
}
