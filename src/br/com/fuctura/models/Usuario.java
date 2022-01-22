package br.com.fuctura.models;

import javax.persistence.Column;
import javax.persistence.Id;

public class Usuario {
	
	
	@Column(name="NomeDoUsuario", length = 120, nullable = false)
	private String nome;
	
	@Id
	private String email;
	
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
}
