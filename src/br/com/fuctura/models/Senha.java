package br.com.fuctura.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Senha {
	
	@Id
	private String codigo;
	
	@Column(nullable = false)
	private String valor;
	
	@OneToOne		
	private Usuario usuario;
}
