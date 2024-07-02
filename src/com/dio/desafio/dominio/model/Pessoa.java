package com.dio.desafio.dominio.model;

import java.util.LinkedHashSet;
import java.util.Set;

import com.dio.desafio.dominio.interfaces.IPessoa;

public abstract class Pessoa implements IPessoa {

	protected String nome;
	protected Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	protected Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	protected static final int PRO = 1;
	protected static final int GLOBAL = 2;
	protected int tipoPlano;

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	
	public int getTipoPlano() {
		return tipoPlano;
	}
	
	public void setTipoPlano(int tipoPlano) {
		this.tipoPlano = tipoPlano;
	}
	
	

}
