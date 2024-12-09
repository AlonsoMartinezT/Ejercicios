package com.ejercicio;
import java.util.*;
/*
Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
Utilizar un objeto HashMap para almacenar los pares de palabras.
Escoger al azar 5 palabras en español del mini diccionario.
Pedir al usuario que teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas.
Al final debe mostrar por consola cuántas respuestas correctas e incorrectas tiene el usuario.
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Hola", "Hello");
        diccionario.put("Adiós", "Goodbye");
        diccionario.put("Gracias", "Thank you");
        diccionario.put("Perdón", "Sorry");
        diccionario.put("Sí", "Yes");
        diccionario.put("No", "No");
        diccionario.put("Amigo", "Friend");
        diccionario.put("Mujer", "Woman");
        diccionario.put("Hombre", "Man");
        diccionario.put("Niño", "Boy");
        diccionario.put("Niña", "Girl");
        diccionario.put("Casa", "House");
        diccionario.put("Escuela", "School");
        diccionario.put("Coche", "Car");
        diccionario.put("Libro", "Book");
        diccionario.put("Comida", "Food");
        diccionario.put("Agua", "Water");
        diccionario.put("Trabajo", "Work");
        diccionario.put("Feliz", "Happy");
        List<String> palabrasEspanol = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabrasEspanol);
        List<String> palabrasSeleccionadas = palabrasEspanol.subList(0, 5);
        int correctas = 0;
        int incorrectas = 0;
        Scanner scanner = new Scanner(System.in);
        for (String palabraEspanol : palabrasSeleccionadas) {
            System.out.println("¿Cuál es la traducción de '" + palabraEspanol + "'?");
            String respuestaUsuario = scanner.nextLine();
            if (diccionario.get(palabraEspanol).equalsIgnoreCase(respuestaUsuario)) {
                System.out.println("¡Correcto!");
                correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.get(palabraEspanol));
                incorrectas++;
            }
        }
        System.out.println("\nResultados:");
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);
        scanner.close();
    }
}