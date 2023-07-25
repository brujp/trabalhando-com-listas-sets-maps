package br.com.brujp;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso cursoJavaColecoes = new Curso(
                "Dominando as coleções",
                "Bruno Pinto");

        List<Aula> aulas = cursoJavaColecoes.getAulas();
        System.out.println(aulas);

        cursoJavaColecoes.adiciona(new Aula("Uau", 35));
        cursoJavaColecoes.adiciona(new Aula("Spring Boot", 20));
        cursoJavaColecoes.adiciona(new Aula("Aprendendo Coleções", 22));

        System.out.println(cursoJavaColecoes.getAulas());

        System.out.println(cursoJavaColecoes.getNomeInstrutor());
    }
}
