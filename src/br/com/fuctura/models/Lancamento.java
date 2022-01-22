package br.com.fuctura.models;

import javax.persistence.Column;
import javax.persistence.Id;

public class Lancamento {
	
	@Id
	@Column(nullable = false)
	private String codigo;
	
	@Column(nullable = false)
	private Double valor;
	
	@Column(nullable = false)
	private String descricao;

}
