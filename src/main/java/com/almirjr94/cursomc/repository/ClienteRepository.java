package com.almirjr94.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.almirjr94.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
