package com.dio.desafio.dominio.model;

public class Curso extends Conteudo {

	private int cargaHoraria;

	public Curso() {

	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}


	@Override
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso Título= " + getTitulo() + ", Descricao= "
				+ getDescricao() + ", Carga horária= "  + getCargaHoraria();
	}

	
	

	

}
