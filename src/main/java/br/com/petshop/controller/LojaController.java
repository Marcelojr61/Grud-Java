package br.com.petshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.petshop.model.Loja;
import br.com.petshop.service.LojaService;

@RestController
@RequestMapping("/loja")

public class LojaController {
	
	@Autowired
	LojaService lojaService;
		
	@PostMapping("/salvar")
	public Loja salvarLoja() {
		
		return lojaService.salvarLoja();
	}
	
	@DeleteMapping("/deletar2")
	public Loja deletarLoja() {
		
		return lojaService.deletarLoja();
	}
	
	@GetMapping("/listar2")
	public List<Loja> listarLoja(){
	
		return null;
	}	
	
	@PutMapping("/atualizar2")
	public Loja  atualizarLoja() {
		
		return lojaService.atualizarLoja();
	}
	

}
