package com.forum.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.forum.enuns.Nivel;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@Column(name="nick")	
	private String nick;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="senha")
	private String senha;
	
	@Column(name="nivel")
	private Nivel nivel;
	
	public Usuario() {
		
	}

	
	
	public Usuario(String nick, String nome, String email, String senha, Nivel nivel) {
		super();
		this.nick = nick;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.nivel = nivel;
	}



	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	
	
}