package Pruebas;

import java.util.Scanner;

public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaraci�n de variables 
        //----------------------------------------------
        
        // Constantes
        final char CAJA_TECHO = '-';   // Caracter para el techo y base de la caja
        final char CAJA_ALTO = '|';    // Caracter para el alto de la caja
        final char CAJA_ESQUINA = '+'; // Caracter para las esquinas de la caja
        final char CAJA_VACIA = ' ';   // Caracter para los espacios de la caja


        // Variables de entrada
        int numFila;            // N�mero de filas de la caja
        int numColumna;         // N�mero de columnas de la caja
        int rellena;            // Indica si la caja esta rellena o vacia

        // Variables de salida
        String cajaConstruida = "";
        String cajaRellena;

        // Variables auxiliares
        
        // Clase Scanner para petici�n de datos
        Scanner teclado = new Scanner(System.in);

        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("CONSTRUCCI�N DE CAJAS");
        System.out.println("---------------------");
        
        // Le pedimos al usuario que introduzca un n�mero de filas entre 2 y 10
        do {
            System.out.print("Introduzca un n�mero de filas (2-10): ");
            numFila = teclado.nextInt(); 
        } while (numFila < 2 || numFila > 10);
        
        // Le pedimos al usuario que introduzca un n�mero de columnas entre 2 y 10
        do {
            System.out.print("Introduzca un n�mero de columnas (entre 2-10): ");
            numColumna = teclado.nextInt(); 
        } while (numColumna < 2 || numColumna > 10);
        
        /*Le pedimos al usuario que indique si la caja esta vac�a con valor 0
          o si esta llena indicandolo con cualquier otro valor num�rico*/
        System.out.print("�Caja rellena? (0: vac�a, cualquier otro n�mero rellena): ");
        rellena = teclado.nextInt();


        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        // Asignaci�n de si la caja esta rellena o vac�a seg�n los valores introducidos
        switch (rellena){
            case 0:
                cajaRellena = "vac�a";
            break;
            default:
                cajaRellena = "rellena";
        }
        
        // Construcci�n de la caja en base a las constantes declaradas
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
          segun el n�mero de filas y columnas introducidas inicialmente*/
        System.out.println("Caja de tama�o " + numFila + "x" + numColumna + " " + cajaRellena + ":");
        System.out.println(cajaConstruida);



    }

}

