package Pruebas;

import java.util.Scanner;

public class Ejercicio08 {
	 
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaraci�n de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        double litrosIniciales;    // Litros iniciales del dep�sito 

        
        // Variables de salida
        double litrosPrimerTramo;  // Litros consumidos en el primer trayecto
        double litrosSegundoTramo; // Litros consumidos en el segundo trayecto
        double litrosSobrantes;    // Litros restantes tras el recorrido

                
        // Variables auxiliares

        
        // Clase Scanner para petici�n de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("TRAYECTO EN DOS ETAPAS");
        System.out.println("----------------------");
        
        // Le pedimos al usuario que introduzca una cantidad inicial de litros para el combustible
        System.out.println("Introduzca la cantidad inicial de litros que se introducen en el dep�sito del veh�culo: ");
        litrosIniciales = teclado.nextDouble();

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        // C�lculo de los resultados aritm�ticos 
        
        litrosPrimerTramo  = litrosIniciales / 2;
        litrosSegundoTramo = litrosPrimerTramo / 4;
        litrosSobrantes    = (litrosIniciales - (litrosPrimerTramo + litrosSegundoTramo));
      
        
        //----------------------------------------------    
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        
        // Mostramos el resultado por pantalla
        System.out.println("Litros consumidos en el primer recorrido: " + litrosPrimerTramo);
        System.out.println("Litros consumidos en el segundo recorrido: " + litrosSegundoTramo);
        System.out.println("Litros sobrantes en el dep�sito: " + litrosSobrantes);
    }    
}

