package br.com.petshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.petshop.model.EnderecoFiscal;

@RestController
@RequestMapping("/enderecoFiscal")

public class EnderecoFiscalController {
	
	public EnderecoFiscal salvarEnderecoFiscal() {
		
		EnderecoFiscal salvarEnderecoFiscal = new EnderecoFiscal();
		
		salvarEnderecoFiscal.setEndereco("Estância V Mod 09 casa 17A");
		
		System.out.println("Endereço salvo com sucesso");
		
		return (salvarEnderecoFiscal);
	}
	
	public EnderecoFiscal deletarEnderecoFiscal() {
		
		EnderecoFiscal deletarEnderecoFiscal = new EnderecoFiscal();
		
		System.out.println(" deletado com sucesso");
		
		return (deletarEnderecoFiscal);
	}

}
