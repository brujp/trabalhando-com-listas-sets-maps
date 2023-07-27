package br.com.brujp.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * O teste consiste em verificar a performance HashSet x ArrayList
 * Para percorrer uma lista com 100000 elementos, o HashSet leva apenas 11 milisegundos.
 * Enquanto isso, o ArrayList leva em torno (~) 2470 milisegundos.
 * Com isso, vemos que em alguns casos, o uso de uma List se torna inviável.
 */

public class TesteDePerformance {

    public static void main(String[] args) {

        Collection<Integer> numeros = new ArrayList<>();
        //Collection<Integer> numeros = new HashSet<>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }

}