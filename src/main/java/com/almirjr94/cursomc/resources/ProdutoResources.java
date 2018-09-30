package com.almirjr94.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.almirjr94.cursomc.domain.Produto;
import com.almirjr94.cursomc.dto.ProdutoDTO;
import com.almirjr94.cursomc.resources.utils.URL;
import com.almirjr94.cursomc.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoResources {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping("/{id}")
	public ResponseEntity<Produto> listar(@PathVariable("id") Integer id) {
		return ResponseEntity.ok().body(produtoService.find(id));
	}

	@GetMapping
	public ResponseEntity<Page<ProdutoDTO>> findPage(@RequestParam(value = "nome", defaultValue = "") String nome,
													@RequestParam(value = "categorias", defaultValue = "") String categorias,
													@RequestParam(value = "page", defaultValue = "0") Integer page,
													@RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
													@RequestParam(value = "orderBy", defaultValue = "id") String orderBy,
													@RequestParam(value = "direction", defaultValue = "ASC") String direction) {
		List<Integer> ids = URL.decodeIntList(categorias);
		Page<Produto> list = produtoService.search(URL.dedeParam(nome), ids, page, linesPerPage, orderBy, direction);
		Page<ProdutoDTO> listDto = list.map(obj -> new ProdutoDTO(obj));
		return ResponseEntity.ok(listDto);
	}
}
