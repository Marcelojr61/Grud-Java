package br.com.petshop.service;

import br.com.petshop.model.Loja;

public interface LojaService {
	
	Loja salvarLoja();
	Loja atualizarLoja();
	Loja listarLoja();
	Loja deletarLoja();
	
}
