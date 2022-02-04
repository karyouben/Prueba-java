package Pruebas;

import java.util.Scanner;

public class ejercicio02 {
    
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaraci�n de variables 
        //----------------------------------------------

        // Constantes
        
        
        // Variables de entrada
        float numUno; // Primer n�mero
        float numDos; // Segundo n�mero

        
        // Variables de salida
        float tripleNum;        // Triple del primer n�mero 
        float decimaNum;        // D�cima parte del segundo n�mero
        float cuadradoNum;      // Cuadrado del doble del producto de ambos n�meros
        float mitadCuadradoNum; // Mitad del cuadrado de la suma de ambos n�meros

        
        // Variables auxiliares
        float dobleProducto;    // Doble del producto de ambos n�meros
        float sumaNum;          // Suma de ambos n�meros

        
        // Clase Scanner para petici�n de datos de entrada
        Scanner teclado = new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("C�LCULOS ARITM�TICOS");
        System.out.println("--------------------");
        
        System.out.print("Introduzca dos n�meros reales: ");
        System.out.println("");
        
        // Le pedimos el primer n�mero al usuario
        System.out.print("Primer n�mero: ");
        numUno = teclado.nextFloat(); 
        
        // Le pedimos el segundo n�mero al usuario
        System.out.print("Segundo n�mero: ");
        numDos = teclado.nextFloat(); 

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        // Primer c�lculo: triple del primer n�mero
        tripleNum = numUno * 3;
        
        // Segundo c�lculo: d�cima parte del segundo n�mero
        decimaNum = numDos / 10;

        // Tercer c�lculo: cuadrado del doble del producto de ambos n�meros
        dobleProducto = (2 * numUno * numDos);
        cuadradoNum   = dobleProducto * dobleProducto;
        
        // Cuarto c�lculo: mitad del cuadrado de la suma de ambos n�meros
        sumaNum          = (numUno + numDos);
        mitadCuadradoNum = ((sumaNum) * (sumaNum)) / 2;
        
                
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        
        // Mostramos el resultado por pantalla
        System.out.println ("Triple del primer n�mero: " + tripleNum );
        System.out.println ("D�cima parte del segundo n�mero: " + decimaNum );
        System.out.println ("Cuadrado del doble del producto de ambos n�meros: " + cuadradoNum );
        System.out.println ("Mitad del cuadrado de la suma de ambos n�meros: " + mitadCuadradoNum );
        
        
        
    }    
}
