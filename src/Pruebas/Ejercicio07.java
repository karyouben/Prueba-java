package Pruebas;

import java.util.Scanner;

public class Ejercicio07 {
    
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaraci�n de variables 
        //----------------------------------------------

        // Constantes
        final int CERO   = 0;
        final int TRES   = 3;
        final int DIEZ   = 10;
        final int VEINTE = 20;
        

        // Variables de entrada
        int numUno; // El n�mero que voy a estudiar

        
        // Variables de salida
        boolean distintoCero;        // Un n�mero distinto de cero
        boolean negativo;            // Un n�mero menor que cero (negativo)
        boolean entreCeroDiez;       // Un n�mero entre cero y diez (ambos inclusive) 
        boolean multiploTresPositivo;// Un n�mero m�ltiplo de tres, positivo y menor que 20
        
        
        // Variables auxiliares

        // Clase Scanner para petici�n de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("AN�LISIS DE UN N�MERO");
        System.out.println("---------------------");
        
        // Le pedimos al usuario que introduzca un n�mero entero
        System.out.print( "Introduzca un n�mero entero: ");
        numUno = teclado.nextInt(); 
        
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        // C�lculo de los resultados l�gicos
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
        System.out.println("El n�mero es distinto de cero: " + (distintoCero? "true":"false"));
        System.out.println("El n�mero es negativo: " + (negativo? "true":"false"));
        System.out.println("El n�mero est� entre cero y diez (ambos incluidos): " + (entreCeroDiez? "true":"false"));
        System.out.println("El n�mero es m�ltiplo de tres, positivo y menor que veinte: " + (multiploTresPositivo? "true":"false"));
   
        
    }    
}
