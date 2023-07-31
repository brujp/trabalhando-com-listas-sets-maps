package br.com.brujp.classes;

import java.util.*;

public class Curso {

    private final String nomeCurso;
    private final String nomeInstrutor;
    private final List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nomeCurso, String nomeInstrutor) {
        this.nomeCurso = nomeCurso;
        this.nomeInstrutor = nomeInstrutor;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        int tempoTotal = 0;
        for (Aula aula : aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }

    @Override
    public String toString() {
        return "[Curso: " + nomeCurso +
                ". Tempo total: " + this.getTempoTotal() +
                " minutos. Aulas: " + this.aulas + "]";
    }

    public void matricula(Aluno aluno) {
            this.alunos.add(aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
}
