package com.ejercicio;
import java.util.HashMap; // Importamos para crear el diccionario
import java.util.Scanner;
/*
Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
Utiliza un objeto HashMap para almacenar los pares de palabras.
Debe solicitar al usuario una palabra en español e imprimir por consola la palabra en inglés.
Si la palabra escrita no se encuentra en el diccionario debe imprimir un mensaje por consola, diciendo que: “La palabra no se encuentra en el diccionario.”.
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        //Creamos el diccionario con las 20 palabras
        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("amor", "love");
        diccionario.put("feliz", "happy");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("escuela", "school");
        diccionario.put("comer", "eat");
        diccionario.put("beber", "drink");
        diccionario.put("correr", "run");
        diccionario.put("caminar", "walk");
        diccionario.put("trabajo", "work");
        diccionario.put("familia", "family");
        diccionario.put("amigo", "friend");
        diccionario.put("niño", "child");
        diccionario.put("mujer", "woman");
        diccionario.put("hombre", "man");
        diccionario.put("abrir", "open");
        diccionario.put("sol", "sun");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra en español para traducir al inglés:");
        String palabraEspañol = scanner.nextLine().toLowerCase();
        if (diccionario.containsKey(palabraEspañol)) {
            System.out.println("La traducción de '" + palabraEspañol + "' es: " + diccionario.get(palabraEspañol));
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }
        scanner.close();
    }
}
