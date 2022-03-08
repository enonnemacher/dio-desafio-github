package br.com.dio.desafio.application;

import br.com.dio.desafio.domain.Conteudo;
import br.com.dio.desafio.domain.Curso;
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
    }
}
