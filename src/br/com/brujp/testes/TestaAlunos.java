package br.com.brujp.testes;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {

        //O Set não garante que os dados sejam inseridos na ordem que eu coloquei
        //O Set não aceita elementos repetidos
        //Se eu tenho uma lista muito grande, o Set é mais performático
        Collection<String> alunos = new HashSet<>();
        alunos.add("Bruno Pinto");
        alunos.add("Debora Pinto");
        alunos.add("Claudemir Pinto");

        //Duas formas de fazer um ForEach
        for(String aluno: alunos) {
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println("#########");

        System.out.println(alunos);

        boolean brunoEstaMatriculado = alunos.contains("Bruno Pinto");
        System.out.println(brunoEstaMatriculado);

        alunos.remove("Bruno Pinto");
        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos);

        alunosEmLista.add("Mais um aluno");
        alunosEmLista.add("Abel Ferreira");

        Collections.sort(alunosEmLista);
        System.out.println(alunosEmLista);
    }
}
