package com.forum.entidades;

public class SubTopico {
	
	private String nome;
	
	private Topico topico;

	public SubTopico() {
		
	}
	
	public SubTopico(String nome, Topico topico) {
		super();
		this.nome = nome;
		this.topico = topico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Topico getTopico() {
		return topico;
	}

	public void setTopico(Topico topico) {
		this.topico = topico;
	}
	
	

}
