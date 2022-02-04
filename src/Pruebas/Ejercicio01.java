package Pruebas;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaraci�n de variables 
        //----------------------------------------------
        // Constantes
        final byte MIN_FILAS = 1;
        final byte MAX_FILAS = 10;

        // Variables de entrada
        int numFilas;

        // Variables de salida
        String cadenaResultado = "";

        // Variables auxiliares
        boolean entradaValida = false;
        byte numero = 1;

        // Clase Scanner para petici�n de datos
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("ESCALERA INCREMENTAL: PRUEBA DEL ALUMNO KARIM YOUSSAFI BENICHIKH");     // Cambiar por "PRUEBA DEL ALUMNO NOMBRE APELLIDO1 APELLIDO2"
        System.out.println("------------------------------------------------------------------");
        do {
            System.out.print("Introduzca n�mero de filas (" + 
                    MIN_FILAS + "-" + MAX_FILAS + "): ");
            numFilas = teclado.nextByte();
            if (numFilas >= MIN_FILAS && numFilas <= MAX_FILAS) {
                entradaValida = true;
            }
        } while (!entradaValida);

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        for (int fila = 1; fila <= numFilas; fila++) {
            cadenaResultado += fila + ": ";
            for (int columna = 1; columna <= fila; columna++) {
                cadenaResultado += numero + " ";
                numero++;
            }
            cadenaResultado += "\n";
        }

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println(cadenaResultado);
    }

}
