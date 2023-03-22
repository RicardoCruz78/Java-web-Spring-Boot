package com.ricardo.funciodepart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardo.funciodepart.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	
	

}
