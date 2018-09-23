package com.almirjr94.cursomc.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.almirjr94.cursomc.domain.Categoria;
import com.almirjr94.cursomc.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaResources {

	@Autowired
	private CategoriaService categoriaService;

	@GetMapping("/{id}")
	public ResponseEntity<Categoria> find(@PathVariable("id") Integer id) {
		return ResponseEntity.ok().body(categoriaService.find(id));
	}

	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Categoria categoria) {
		categoriaService.insert(categoria);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(categoria.getId())
				.toUri();

		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<Void> update(@PathVariable("id")Integer id, @RequestBody Categoria categoria){
		categoria.setId(id);
		categoria = categoriaService.update(categoria);
		return ResponseEntity.noContent().build();
	}
}
