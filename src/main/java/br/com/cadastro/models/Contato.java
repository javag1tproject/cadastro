package br.com.cadastro.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="contatos")
public class Contato {
	
	@Id
	@GeneratedValue
	private Long idcontatos;
	
	private String nome;
	
	private String email;

	public Long getIdcontatos() {
		return idcontatos;
	}

	public void setIdcontatos(Long idcontatos) {
		this.idcontatos = idcontatos;
	}

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
	
	

}
