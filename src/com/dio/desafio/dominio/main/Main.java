package com.dio.desafio.dominio.main;

import java.time.LocalDate;

import com.dio.desafio.dominio.model.Bootcamp;
import com.dio.desafio.dominio.model.Curso;
import com.dio.desafio.dominio.model.Mentoria;
import com.dio.desafio.dominio.service.Dev;
import com.dio.desafio.dominio.service.Tutor;

public class Main {

	public static void main(String[] args) {
		
		
		Curso curso = new Curso();
		Curso curso2 = new Curso();

		curso.setTitulo("Trilha Java Básico");
		curso.setDescricao("Fundamentos da linguagem Java");
		curso.setCargaHoraria(8);

		curso2.setTitulo("Git e Github");
		curso2.setDescricao("Comandos básicos de git e noções de github");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();

		mentoria.setTitulo("mentoria Java");
		mentoria.setDescricao("descricao mentoria java");
		mentoria.setData(LocalDate.now());

		Dev dev = new Dev();
		
		Dev dev2 = new Dev();
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		
	    Tutor tutor = new Tutor();
	    tutor.setNome("Venilton");
	    tutor.inscreverBootcamp(bootcamp);
	    System.out.println("Tutor: " + tutor.getNome());
	    
	
		
		
	    dev.setNome("Vinicius");
		dev.setTipoPlano(2);
		dev.inscreverBootcamp(bootcamp);
		System.out.println("Aluno: " + dev.getNome());
		System.out.println("Conteudos isncritos: " + dev.getConteudosInscritos());
		System.out.println("Conteudos concluidos: " + dev.getConteudosConcluidos());
		System.out.println("Tipo de plano: " + dev.getTipoPlano());
		
        dev.progredir();
        dev.progredir();
        dev.progredir();
		
        dev.calcularXP();
		System.out.println("Conteudos isncritos: " + dev.getConteudosInscritos());
		System.out.println("Conteudos concluidos: " + dev.getConteudosConcluidos());
		System.out.println("Total XP: "  + dev.calcularXP());
		
		System.out.println("-----------------------------------------");
		
		 System.out.println("Tutor: " + tutor.getNome());
		dev2.setNome("Larissa");
		dev2.setTipoPlano(1);
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Aluno: " + dev2.getNome());
		System.out.println("Conteudos isncritos: " + dev2.getConteudosInscritos());
		System.out.println("Conteudos concluidos: " + dev2.getConteudosConcluidos());
		System.out.println("Tipo de plano: " + dev2.getTipoPlano());
		
        dev2.progredir();
		
        
        
        dev2.calcularXP();
		System.out.println("Conteudos isncritos: " + dev2.getConteudosInscritos());
		System.out.println("Conteudos concluidos: " + dev2.getConteudosConcluidos());
		System.out.println("Total XP: "  + dev2.calcularXP());
		
		
		
		
	
		
		
		
		
		
		
		

	}

}
