package com.ejercicio;
import java.util.Scanner;
import java.util.ArrayList;

/*
Debe solicitar al usuario 10 números por consola y almacenarlos en un array.
Debe pasar los números que sean primos a las primeras posiciones, desplazando los demás números al final, de tal forma que no se pierda ningún número.
Debe mostrar por consola el array original, mostrando el índice seguido del valor de la posición.
Debe mostrar por consola el array que contiene los números primos al principio, mostrando el índice seguido del valor de la posición. El orden de los números no importa, siempre y cuando los números primos vayan al principio del array.
 */

public class Main {
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Por favor, ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("\nArray original:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
        ArrayList<Integer> primos = new ArrayList<>();
        ArrayList<Integer> noPrimos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (esPrimo(numeros[i])) {
                primos.add(numeros[i]);
            } else {
                noPrimos.add(numeros[i]);
            }
        }
        primos.addAll(noPrimos);
        System.out.println("\nArray con los números primos al principio:");
        for (int i = 0; i < primos.size(); i++) {
            System.out.println("Índice " + i + ": " + primos.get(i));
        }

        scanner.close(); 
    }
}
