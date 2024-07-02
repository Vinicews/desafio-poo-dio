package com.dio.desafio.dominio.model;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	LocalDate data;
	
	public Mentoria() {
		
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}

	@Override
	public String toString() {
		return "Mentoria [data=" + data + 
				", Titulo=" + getTitulo() + 
				", Descricao=" + getDescricao() + "]";
	}


	
	
	

}
