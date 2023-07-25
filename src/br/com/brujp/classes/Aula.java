package br.com.brujp.classes;

public class Aula implements Comparable<Aula>{

    private String titulo;
    private int tempo;

    //Construtor
    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    //Reescrevendo o método toString
    @Override
    public String toString() {
        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }

    //Necessário para realizar a ordenação do Array
    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }


}
