package br.com.brujp.testes;

import br.com.brujp.classes.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArrayList", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        //aulas.add("Adicionando mais uma"); - Erro (Minha lista é do tipo Aula e não String

        System.out.println(aulas);

        //Ordenando o Array aulas pelo titulo
        Collections.sort(aulas);
        System.out.println(aulas);

        //Ordenando o Array aulas pelo tempo
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

        //Ordenando pelo tempo de uma forma diferente (melhor)
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

    }
}
