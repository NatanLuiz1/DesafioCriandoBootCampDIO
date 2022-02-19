package desafioDioBootcamp;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso cursojs = new Curso();
		cursojs.setTitulo("JS");
		cursojs.setDescricao("Programacao web");
		cursojs.setCargaHoraria(5);
		
		Curso cursoPython = new Curso();
		cursoPython.setTitulo("Python");
		cursoPython.setDescricao("IA curso");
		cursoPython.setCargaHoraria(10);
		
		Mentoria ment = new Mentoria();
		ment.setTitulo("spring");
		ment.setDescricao("sprint Tester");
		ment.setData(LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("aprenderJava");
		bootcamp.setDescricao("JAVA");
		bootcamp.getConteudos().add(cursojs);
		bootcamp.getConteudos().add(cursoPython);
		bootcamp.getConteudos().add(ment);
		
		
		Dev devLuiz = new Dev();
		devLuiz.setNome("Luiz");
		devLuiz.inscreverBootCamp(bootcamp);
		System.out.println("Conteudos inscritos Luiz: "+ devLuiz.getConteudosInscritos());
		System.out.println();
		devLuiz.progredir();
		System.out.println("Conteudos inscritos Luiz: "+ devLuiz.getConteudosConcluidos());
		System.out.println();
		System.out.println("Conteudos inscritos Luiz: "+ devLuiz.getConteudosInscritos());
		System.out.println("XP TOTAL: "+ devLuiz.calcularTotalXp());
		System.out.println();
		System.out.println();
		
		
		Dev devMarcio = new Dev();
		devMarcio.setNome("Marcio");
		devMarcio.inscreverBootCamp(bootcamp);
		System.out.println("Conteudos inscritos Marcio: "+ devMarcio.getConteudosInscritos());
		System.out.println();
		devMarcio.progredir();
		System.out.println("Conteudos inscritos Luiz: "+ devLuiz.getConteudosConcluidos());
		System.out.println();
		System.out.println("Conteudos inscritos Marcio: "+ devMarcio.getConteudosInscritos());
		System.out.println("XP TOTAL: "+ devMarcio.calcularTotalXp());
		
	}

}
