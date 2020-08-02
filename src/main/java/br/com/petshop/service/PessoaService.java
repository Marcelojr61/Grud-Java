package br.com.petshop.service;

import java.util.List;

import br.com.petshop.model.Pessoa;

public interface PessoaService {
	
	Pessoa salvarPessoa(Pessoa pessoa);
	String deletarPessoa(Long cpf); 
	List<Pessoa> listarPessoa(String nome);
	Pessoa atualizarPessoa(Pessoa pessoa, Long cpf);
	Pessoa listarPessoaPorCpf(Long cpf);
	
}
