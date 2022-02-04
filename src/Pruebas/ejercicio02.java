package Pruebas;

import java.util.Scanner;

public class ejercicio02 {
    
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes
        
        
        // Variables de entrada
        float numUno; // Primer número
        float numDos; // Segundo número

        
        // Variables de salida
        float tripleNum;        // Triple del primer número 
        float decimaNum;        // Décima parte del segundo número
        float cuadradoNum;      // Cuadrado del doble del producto de ambos números
        float mitadCuadradoNum; // Mitad del cuadrado de la suma de ambos números

        
        // Variables auxiliares
        float dobleProducto;    // Doble del producto de ambos números
        float sumaNum;          // Suma de ambos números

        
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("CÁLCULOS ARITMÉTICOS");
        System.out.println("--------------------");
        
        System.out.print("Introduzca dos números reales: ");
        System.out.println("");
        
        // Le pedimos el primer número al usuario
        System.out.print("Primer número: ");
        numUno = teclado.nextFloat(); 
        
        // Le pedimos el segundo número al usuario
        System.out.print("Segundo número: ");
        numDos = teclado.nextFloat(); 

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        // Primer cálculo: triple del primer número
        tripleNum = numUno * 3;
        
        // Segundo cálculo: décima parte del segundo número
        decimaNum = numDos / 10;

        // Tercer cálculo: cuadrado del doble del producto de ambos números
        dobleProducto = (2 * numUno * numDos);
        cuadradoNum   = dobleProducto * dobleProducto;
        
        // Cuarto cálculo: mitad del cuadrado de la suma de ambos números
        sumaNum          = (numUno + numDos);
        mitadCuadradoNum = ((sumaNum) * (sumaNum)) / 2;
        
                
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        
        // Mostramos el resultado por pantalla
        System.out.println ("Triple del primer número: " + tripleNum );
        System.out.println ("Décima parte del segundo número: " + decimaNum );
        System.out.println ("Cuadrado del doble del producto de ambos números: " + cuadradoNum );
        System.out.println ("Mitad del cuadrado de la suma de ambos números: " + mitadCuadradoNum );
        
        
        
    }    
}
