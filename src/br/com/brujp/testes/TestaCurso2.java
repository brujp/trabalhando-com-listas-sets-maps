package br.com.brujp.testes;

import br.com.brujp.classes.Aula;
import br.com.brujp.classes.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso(
                "Dominando as coleções do Java",
                "Bruno Pinto");

        javaColecoes.adiciona(new Aula("Uau 1", 15));
        javaColecoes.adiciona(new Aula("Uau 2", 45));
        javaColecoes.adiciona(new Aula("Uau 3", 23));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println("Aulas imutáveis: " + aulasImutaveis);

        //Ordenando a lista
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);

    }
}
