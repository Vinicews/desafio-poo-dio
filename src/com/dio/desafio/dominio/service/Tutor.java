package com.dio.desafio.dominio.service;

import java.util.Objects;

import com.dio.desafio.dominio.model.Bootcamp;
import com.dio.desafio.dominio.model.Pessoa;

public class Tutor extends Pessoa {

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getTutor().add(this);

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
		Tutor other = (Tutor) obj;
		return Objects.equals(conteudosInscritos, other.conteudosInscritos)
				 && Objects.equals(nome, other.nome);
	}





	

}
