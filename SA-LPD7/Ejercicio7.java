package com.ejercicio;
import java.util.Scanner;

/*
Debe solicitar al usuario un día de la semana (de lunes a viernes).
Debe solicitar al usuario una hora (horas y minutos).
Debe calcular cuantos minutos faltan para el fin de semana. Se considera que el fin de semana comienza el viernes a las 15:00 hrs.
Debe mostrar el resultado por consola.
Debe ser capaz de identificar si los datos de entrada son válidos (día de la semana válido, hora válida, minutos válidos), en caso contrario debe mandar un mensaje de error y volver a solicitar los datos.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ingresa el día de la semana (lunes a viernes):");
            String dia = scanner.nextLine().toLowerCase();
            if (!dia.equals("lunes") && !dia.equals("martes") && !dia.equals("miércoles") && !dia.equals("jueves") && !dia.equals("viernes")) {
                System.out.println("Día inválido. Intenta de nuevo.");
                continue;
            }
            System.out.println("Ingresa la hora (0-23):");
            int hora = scanner.nextInt();
            System.out.println("Ingresa los minutos (0-59):");
            int minutos = scanner.nextInt();
            if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) {
                System.out.println("Hora o minutos inválidos. Intenta de nuevo.");
                scanner.nextLine();
                continue;
            }
            int minutosFaltantes = calcularMinutosFaltantes(dia, hora, minutos);
            if (minutosFaltantes >= 0) {
                System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");
                break;
            } else {
                System.out.println("No es posible calcular el tiempo");
                break;
            }
        }

        scanner.close();
    }
    public static int calcularMinutosFaltantes(String dia, int hora, int minutos) {
        int diaFinSemana = 5;
        int horaFinSemana = 15;
        int minutosFinSemana = 0;
        int diaActual = 0;
        switch (dia) {
            case "lunes": diaActual = 1; break;
            case "martes": diaActual = 2; break;
            case "miércoles": diaActual = 3; break;
            case "jueves": diaActual = 4; break;
            case "viernes": diaActual = 5; break;
        }
        int minutosTotalesActuales = (diaActual - 1) * 1440 + hora * 60 + minutos; 
        int minutosTotalesFinSemana = (diaFinSemana - 1) * 1440 + horaFinSemana * 60 + minutosFinSemana;
        return minutosTotalesFinSemana - minutosTotalesActuales;
    }
}