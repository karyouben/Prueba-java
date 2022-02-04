package Pruebas;

import java.util.Scanner;

public class Ejercicio10 {
 
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes

        // Variables de entrada
        char primeraLetra;
        char ultimaLetra;
        char punto;
        String texto;
 
        
        // Variables de salida
        boolean cincoCaracter;   // Indica si el texto tiene más de cinco caracteres
        boolean letraMayuscula;  // Indica si el texto empieza por mayúscula
        boolean letraMinuscula;  // Indica si el texto empieza por minúscula
        boolean puntoSuspensivo; // Indica si el texto termina en puntos suspensivos
  
        
        // Variables auxiliares
        char numeroPuntosUno; // Indica que el texto tiene 1 punto alfinal
        char numeroPuntosDos; // Indica que el texto tiene 1 punto en la penúltima posición
        char numeroPuntosTres; // Indica que el texto tiene 1 puntos en la antepenúltima posición

        
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("ANÁLISIS DE UN TEXTO");
        System.out.println("--------------------");
        
        // Le pedimos al usuario que introduzca un texto
        System.out.print( "Introduzca un texto: ");
        texto = teclado.nextLine(); 
        
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        // Asignación de la primera letra del texto escrito
        primeraLetra = texto.charAt(0);
        
        // Asignación de la última letra del texto escrito
        ultimaLetra = texto.charAt(texto.length()-1);
        
        // Comprobar que el texto tenga 3 puntos alfinal
        punto = '.';
        numeroPuntosUno = (texto.charAt(texto.length()-1));
        numeroPuntosDos = (texto.charAt(texto.length()-2));
        numeroPuntosTres = (texto.charAt(texto.length()-3));
        
        // Comprobación que el texto tiene más de cinco caracteres
        cincoCaracter = texto.length() > 5;
        
        // Comprobación que el texto empieza por mayúscula
        letraMayuscula = primeraLetra<='Z' && primeraLetra>='A';
        
        // Comprobación que el texto empieza por minúscula
        letraMinuscula = ultimaLetra<='z' && ultimaLetra>='a';
                
        // Comprobación que el texto termina en puntos suspensivos    
        puntoSuspensivo = ((numeroPuntosUno & numeroPuntosDos & numeroPuntosTres) == punto);
           
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        
        // Mostramos el resultado por pantalla
        System.out.println("El texto contiene más de cinco caracteres: "          + (cincoCaracter? "true":"false"));
        System.out.println("El texto comienza con una letra mayúscula: "          + (letraMayuscula? "true":"false"));
        System.out.println("El texto termina con una letra minúscula: "           + (letraMinuscula? "true":"false"));
        System.out.println("El texto termina con unos puntos suspensivos (...): " + (puntoSuspensivo? "true":"false"));
   
    }    
}
