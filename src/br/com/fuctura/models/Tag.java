package br.com.fuctura.models;

import javax.persistence.Column;
import javax.persistence.Id;

public class Tag {
		
	@Id
	private String codigo;
	
	@Column(nullable = false)
	private String nome;
	
	
}
