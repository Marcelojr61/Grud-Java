package br.com.petshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.petshop.model.Pessoa;
import br.com.petshop.repository.PessoaRepository;
import br.com.petshop.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService{
	
	@Autowired
	PessoaRepository pessoaRepository;

	@Override
	public Pessoa salvarPessoa(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	@Override
	public String deletarPessoa(Long cpf) {
		
		Integer rsPessoa = pessoaRepository.deleteByCpf(cpf);
		
		if (rsPessoa == 0){
			
			return "O CPF: " + cpf + " não foi encontrado, verifique o dado e retorne a ação novamente. ";
		} else 
			return "O CPF: " + cpf + " foi encontrado e deletado com sucesso";
		
	}

	@Override
	public Pessoa listarPessoaPorCpf(Long cpf) {
		return pessoaRepository.findByCpf(cpf);
	}
	
	@Override
	public Pessoa atualizarPessoa(Pessoa pessoa, Long cpf) {
		
		Pessoa rsPessoa = pessoaRepository.findByCpf(cpf);
		pessoa.setId(rsPessoa.getId());
		
		return pessoaRepository.save(pessoa);
	}

	@Override
	public List<Pessoa> listarPessoa(String nome) {
		return pessoaRepository.findByNome(nome);
	}



	
}
