package com.dio.desafio.dominio.service;

import java.util.Objects;
import java.util.Optional;

import com.dio.desafio.dominio.model.Bootcamp;
import com.dio.desafio.dominio.model.Conteudo;
import com.dio.desafio.dominio.model.Curso;
import com.dio.desafio.dominio.model.Pessoa;

public class Dev extends Pessoa {

	public void inscreverBootcamp(Bootcamp bootcamp) {
		if (this.tipoPlano == PRO) {
	        for (Conteudo conteudo : bootcamp.getConteudos()) {
	            if (conteudo instanceof Curso) {
	                this.conteudosInscritos.add(conteudo);
	            }
	        }
	    } else if (this.tipoPlano == GLOBAL) {
	        this.conteudosInscritos.addAll(bootcamp.getConteudos());
	    }
	   bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		} else {
			System.err.println("Você não está matriculado em nenhum conteúdo.");
		}

	}
	
	
	public double calcularXP() {
		return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();

	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}

	
	

	

	
}
