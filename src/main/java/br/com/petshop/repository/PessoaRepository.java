package br.com.petshop.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.petshop.model.Pessoa;

@Repository

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
	Pessoa findByCpf(Long cpf);
	List<Pessoa> findByNome(String nome);
	
	@Transactional
	Integer deleteByCpf(Long cpf);
		

}
