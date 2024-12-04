

package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class LerArrayList {

    public static void main(String[] args) {
        // ArrayList para armazenar os números
        ArrayList<Integer> numeros = new ArrayList<>();

        //Inserir 30 mil números no ArrayList
        for (int i = 1; i <= 30000; i++) {
            numeros.add(i);
        }

        // Ler e exibir os 30 mil números no console
        System.out.println("Números no ArrayList:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
