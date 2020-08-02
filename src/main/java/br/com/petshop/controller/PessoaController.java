package br.com.petshop.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.petshop.model.Pessoa;
import br.com.petshop.service.PessoaService;

@RestController
@RequestMapping("/petshop")
public class PessoaController {
	
	@Autowired
	PessoaService pessoaService;
	
	@PostMapping("/salvarPessoa")
	public Pessoa salvarPessoa(@RequestBody @Valid Pessoa pessoa){
		
		return pessoaService.salvarPessoa(pessoa);				
	}
	
	@DeleteMapping("/deletarPessoa/{cpf}")
	public String deletarPessoa(@PathVariable Long cpf) {
		return pessoaService.deletarPessoa(cpf);
	}
	
	@GetMapping("/listarPessoaPorCpf")
	public Pessoa listarPessoaPorCpf(@RequestParam Long cpf) {
		return pessoaService.listarPessoaPorCpf(cpf);
	}
	
	@GetMapping ("/listarPessoa")
	public List<Pessoa> listarPessoa (String nome){
		return pessoaService.listarPessoa(nome);
	}
		
	@PutMapping("/atualizarPessoa/{cpf}")
	public Pessoa atualizarPessoa(@RequestBody @Valid Pessoa pessoa, @PathVariable Long cpf) {
		
		return pessoaService.atualizarPessoa(pessoa, cpf);
	}

}
