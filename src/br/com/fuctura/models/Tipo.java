package br.com.fuctura.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tipo {
	
	
	@Id
	private Integer codigo;
	
	@Column(nullable = false)
	private String nome;
	

}
