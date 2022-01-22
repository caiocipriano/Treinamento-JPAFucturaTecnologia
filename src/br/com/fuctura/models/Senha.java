package br.com.fuctura.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Senha {
	
	@Id
	private Integer codigo;
	
	@Column(nullable = false)
	private String valor;
	
	private Boolean isSenhaExpirada;
	
	@OneToOne		
	private Usuario usuario;
}
