package com.forum.entidades;

public class Usuario {
	
	private int id;
	
	private String nick;
	
	private String nome;
	
	private String email;
	
	private String senha;
	
	public Usuario() {
		
	}

	public Usuario(int id, String nick, String nome, String email, String senha) {
		super();
		this.id = id;
		this.nick = nick;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	

}
