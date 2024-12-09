package com.ejercicio;
import java.util.Scanner;

//Debe solicitar al usuario por consola una palabra o frase.
//Debe mostrar por consola el texto escrito al revés.

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scanner = new Scanner(System.in);
		System.out.println("Introduce una palabra o frase:");
	    String texto = scanner.nextLine();
	    String textoReverso = new StringBuilder(texto).reverse().toString();
        System.out.println("El texto al revés es: " + textoReverso);
        scanner.close();
	}

}
