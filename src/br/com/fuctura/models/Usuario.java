package br.com.fuctura.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Usuario {
	
	
	@Column(name="NomeDoUsuario", length = 120, nullable = false)
	private String nome;
	
	@Id
	private String email;
	
	private Integer idade;

	@OneToOne
	private Senha senha;

}
