package br.com.brujp.testes;

import br.com.brujp.classes.Aluno;
import br.com.brujp.classes.Aula;
import br.com.brujp.classes.Curso;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso(
                "Dominando as coleções do Java",
                "Bruno Pinto");

        javaColecoes.adiciona(new Aula("Uau 1", 15));
        javaColecoes.adiciona(new Aula("Uau 2", 45));
        javaColecoes.adiciona(new Aula("Uau 3", 23));

        Aluno a1 = new Aluno("Titicia", 5463);
        Aluno a2 = new Aluno("Mauricio", 3564);
        Aluno a3 = new Aluno("Claudemir", 5735);

        //javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");

        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a.toString());
        });

        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));
    }
}
