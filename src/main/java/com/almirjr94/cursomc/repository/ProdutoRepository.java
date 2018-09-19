package com.almirjr94.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.almirjr94.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
