package Pruebas;

import java.util.Scanner;

public class Ejercicio07 {
    
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes
        final int CERO   = 0;
        final int TRES   = 3;
        final int DIEZ   = 10;
        final int VEINTE = 20;
        

        // Variables de entrada
        int numUno; // El número que voy a estudiar

        
        // Variables de salida
        boolean distintoCero;        // Un número distinto de cero
        boolean negativo;            // Un número menor que cero (negativo)
        boolean entreCeroDiez;       // Un número entre cero y diez (ambos inclusive) 
        boolean multiploTresPositivo;// Un número múltiplo de tres, positivo y menor que 20
        
        
        // Variables auxiliares

        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("ANÁLISIS DE UN NÚMERO");
        System.out.println("---------------------");
        
        // Le pedimos al usuario que introduzca un número entero
        System.out.print( "Introduzca un número entero: ");
        numUno = teclado.nextInt(); 
        
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        // Cálculo de los resultados lógicos
        distintoCero         = (numUno != CERO);
        negativo             = (numUno < CERO);
        entreCeroDiez        = (CERO <= numUno & numUno <= DIEZ);
        multiploTresPositivo = (numUno % TRES == CERO & numUno > CERO & numUno < VEINTE);
        
     
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        
        // Mostramos el resultado por pantalla
        System.out.println("El número es distinto de cero: " + (distintoCero? "true":"false"));
        System.out.println("El número es negativo: " + (negativo? "true":"false"));
        System.out.println("El número está entre cero y diez (ambos incluidos): " + (entreCeroDiez? "true":"false"));
        System.out.println("El número es múltiplo de tres, positivo y menor que veinte: " + (multiploTresPositivo? "true":"false"));
   
        
    }    
}
