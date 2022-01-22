package br.com.fuctura.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Lancamento {
	
	@Id
	@Column(nullable = false)
	private Integer codigo;
	
	@Column(nullable = false)
	private Double valor;
	
	@Column(nullable = false)
	private String descricao;

	@OneToOne
	private Tipo tipo;
	
	@OneToMany
	private List<Tag> tag;
	
	
}
