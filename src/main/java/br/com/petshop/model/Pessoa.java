package br.com.petshop.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Table(name ="pessoa")
@Entity
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 11111111111111111L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty(message = "É obrigatório informar um nome.")
	@NotNull(message = "Você não informou um nome.")
	private String nome;
	
	@NotNull(message = "Você não informou uma idade.")
	private Integer idade; 
	
	@NotEmpty (message = "É obrigatório informar um rg.")
	@NotNull (message = "Você não informou um rg.")
	private String rg; 
	@NotNull(message = "Você não informou um cpf")
	private Long cpf;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}

	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

}
