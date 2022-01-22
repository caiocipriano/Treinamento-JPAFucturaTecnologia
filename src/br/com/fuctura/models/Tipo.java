package br.com.fuctura.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Tipo {
	
	
	@Id
	private String codigo;
	
	@Column(nullable = false)
	private String nome;
	
	@OneToOne
	private Lancamento lancamento;
}
