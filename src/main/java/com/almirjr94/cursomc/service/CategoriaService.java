package com.almirjr94.cursomc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.almirjr94.cursomc.domain.Categoria;
import com.almirjr94.cursomc.repository.CategoriaRepository;
import com.almirjr94.cursomc.service.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria buscar(Integer id) {
		return categoriaRepository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: "+ id + ", Tipo: "+Categoria.class.getName()));
	}

}
