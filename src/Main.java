import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        //Criando um ArrayList
        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);
        System.out.println(aulas);

        //Percorrendo a lista aulas com foreach
        for (String aula: aulas) {
            System.out.println("Aula: " + aula);
        }

        //Percorrendo a lista aulas com for
        for (int i=0; i < aulas.size(); i++) {
            System.out.println("Aulas: " + aulas.get(i));
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);

        //Para cada aula dentro de aulas, faça
        aulas.forEach(aula-> {
            System.out.println("Percorrendo: " + aula);
        });

        //Ordenar a lista
        aulas.add("Aumentando nosso conhecimento");
        Collections.sort(aulas);
        System.out.println(aulas);

    }
}