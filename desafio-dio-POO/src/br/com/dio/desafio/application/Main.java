package br.com.dio.desafio.application;

import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descricao do curso Java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao do curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao de mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);

        Dev developerEderson = new Dev();
        developerEderson.setNome("Ederson");
        developerEderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + developerEderson.getConteudosInscritos());
        developerEderson.progredir();
        System.out.println("Conteúdos Concluídos" + developerEderson.getConteudosConcluidos());
        System.out.println("XP: " + developerEderson.calcularXp());

        Dev developerJoao = new Dev();
        developerJoao.setNome("João");
        developerJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + developerJoao.getConteudosInscritos());
        developerJoao.progredir();
        System.out.println("Conteúdos Concluídos" + developerJoao.getConteudosConcluidos());
        System.out.println("XP: " + developerJoao.calcularXp());
    }
}
