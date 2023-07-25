package br.com.brujp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private final String nomeCurso;
    private final String nomeInstrutor;
    private final List<Aula> aulas = new LinkedList<Aula>();

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
}
