package Pruebas;

import java.util.Scanner;

public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        
        // Constantes
        final char CAJA_TECHO = '-';   // Caracter para el techo y base de la caja
        final char CAJA_ALTO = '|';    // Caracter para el alto de la caja
        final char CAJA_ESQUINA = '+'; // Caracter para las esquinas de la caja
        final char CAJA_VACIA = ' ';   // Caracter para los espacios de la caja


        // Variables de entrada
        int numFila;            // Número de filas de la caja
        int numColumna;         // Número de columnas de la caja
        int rellena;            // Indica si la caja esta rellena o vacia

        // Variables de salida
        String cajaConstruida = "";
        String cajaRellena;

        // Variables auxiliares
        
        // Clase Scanner para petición de datos
        Scanner teclado = new Scanner(System.in);

        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("CONSTRUCCIÓN DE CAJAS");
        System.out.println("---------------------");
        
        // Le pedimos al usuario que introduzca un número de filas entre 2 y 10
        do {
            System.out.print("Introduzca un número de filas (2-10): ");
            numFila = teclado.nextInt(); 
        } while (numFila < 2 || numFila > 10);
        
        // Le pedimos al usuario que introduzca un número de columnas entre 2 y 10
        do {
            System.out.print("Introduzca un número de columnas (entre 2-10): ");
            numColumna = teclado.nextInt(); 
        } while (numColumna < 2 || numColumna > 10);
        
        /*Le pedimos al usuario que indique si la caja esta vacía con valor 0
          o si esta llena indicandolo con cualquier otro valor numérico*/
        System.out.print("¿Caja rellena? (0: vacía, cualquier otro número rellena): ");
        rellena = teclado.nextInt();


        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        // Asignación de si la caja esta rellena o vacía según los valores introducidos
        switch (rellena){
            case 0:
                cajaRellena = "vacía";
            break;
            default:
                cajaRellena = "rellena";
        }
        
        // Construcción de la caja en base a las constantes declaradas
        for (int i = 0; i < numFila; i++) {
            for (int j = 0; j < numColumna; j++) {
                if (i == 0 || i == numFila - 1) {
                    if (j == 0 || j == numColumna - 1) {
                        cajaConstruida += CAJA_ESQUINA;
                    } else {
                        cajaConstruida += CAJA_TECHO;
                    }
                } else {
                    if (j == 0 || j == numColumna - 1) {
                        cajaConstruida += CAJA_ALTO;
                    } else if (rellena == 0) {
                        cajaConstruida += CAJA_VACIA;
                    } else {
                        cajaConstruida += i;
                    }
                }
            }
            cajaConstruida += "\n";
        }
              
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");

        /*Mostramos el resultado por pantalla de la caja construida
          segun el número de filas y columnas introducidas inicialmente*/
        System.out.println("Caja de tamaño " + numFila + "x" + numColumna + " " + cajaRellena + ":");
        System.out.println(cajaConstruida);



    }

}

