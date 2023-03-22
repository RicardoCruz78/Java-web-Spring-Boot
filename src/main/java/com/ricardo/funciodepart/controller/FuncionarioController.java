package com.ricardo.funciodepart.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.funciodepart.entities.Funcionario;
import com.ricardo.funciodepart.repository.FuncionarioRepository;

@RestController
@RequestMapping(value= "/funcionarios")
public class FuncionarioController {
		@Autowired
	private FuncionarioRepository funcionarioRepo;
	
		
		//listar
		@GetMapping
	public List<Funcionario> findAll() {
		
		List<Funcionario> result = funcionarioRepo.findAll();
		return result;
		
}
		// -------- Buscar pelo id
		
		@GetMapping(value ="/{id}")
		public Funcionario findByid(@PathVariable Long id) {
			
			Funcionario result = funcionarioRepo.findById(id).get();
			return result;
}
		// inserir
		@PostMapping
		public Funcionario insert(@RequestBody Funcionario funcionario) {
			
			Funcionario result = funcionarioRepo.save(funcionario);
			return result;
}
}

