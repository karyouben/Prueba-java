package Pruebas;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes

        
        // Variables de entrada
        int numNaipe;   // Número de la carta introducida
   
        
        // Variables de salida
        int valorNaipe; // Valor de la carta introducida

        
        // Variables auxiliares

        
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("VALOR DE UN NAIPE EN EL TUTE");
        System.out.println("----------------------------");
        
        /* Le pedimos al usuario que introduzca 
        el número de una carta del 1 al 7 o del 10 al 12*/
        System.out.print("Introduzca número (1-7, 10-12): ");
        numNaipe = teclado.nextInt(); 

         
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        // Cálculo del valor del número del naipe introducido
        switch (numNaipe){
            case 1:              // Si el naipe es 1 su valor es 11
                valorNaipe = 11;
                break;
            case 3:              // Si el naipe es 3 su valor es 10
                valorNaipe = 10;
                break;
            case 10:             // Si el naipe es 10 su valor es 2
                valorNaipe = 2;
                break;
            case 11:             // Si el naipe es 11 su valor es 3
                valorNaipe = 3;
                break;
            case 12:             // Si el naipe es 12 su valor es 4
                valorNaipe = 4;
                break;           
            case 2: case 4: case 5: case 6: case 7:
                valorNaipe = 0;  // Si el naipe es 2,4,5,6,7 su valor es 0
                break;
            default:    // En cualquier otro caso el valor del naipe es -1
                valorNaipe = -1;
             
        }

               
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        
        // Mostramos el resultado por pantalla del valor del naipe introducido
        System.out.println ("El valor del naipe con ese número es: " + valorNaipe);



    }
}
