package Pruebas;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        
        // Constantes
        final int VOCAL = 1;          // Valor de la constante si es una vocal
        final int MINUS_XYZ = 2;      // Valor de la constante si es x,y,z minúscula
        final int Mayus_X = 5;        // Valor de la constante si es X mayúscula
        final int OTRO_CARACTER = -1; // Valor de la constante si es otro caracter
        
        // Variables de entrada
        String textoIntroducido;  // Cadena de carácteres del texto introducido
        int numIntroducido;       // Número introducido    
                
        // Variables de salida
        int contadorLetra = 0;   /*Contador del valor total
                                   de las letras del texto introducido*/

        // Variables auxiliares
        char letra;             // Cada letra correspondiente del texto
        int puntuacionFinal;    // Puntuación total del texto
                

        // Clase Scanner para petición de datos
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("VALOR DE UN TEXTO");
        System.out.println("------------------");
        
        // Le pedimos al usuario que introduzca un texto de almenos 5 caracteres
        do {
            System.out.print("Introduzca un texto con al menos 5 caracteres: ");
            textoIntroducido = teclado.nextLine(); 
        } while (textoIntroducido.length() < 5);
        
        // Le pedimos al usuario que introduzca un número comprendido entre el 1 y el 3
        do {
            System.out.print("Introduzca el valor del multiplicador (entre 1-3): ");
            numIntroducido = teclado.nextInt(); 
        } while (numIntroducido > 3 || numIntroducido < 1);
        

        
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        // Cálculo del valor de los caracteres del texto introducido       
        for (int i = 0; i < textoIntroducido.length(); i++) {
            letra = textoIntroducido.charAt(i);
            switch (letra){
                case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U':
                    contadorLetra += VOCAL;
                    break;
                case 'x': case 'y': case 'z':
                    contadorLetra += MINUS_XYZ;
                    break;
                case 'X':
                    contadorLetra += Mayus_X;
                    break;
                default:
                    contadorLetra += OTRO_CARACTER;
          }
        }

      
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        
        // Mostramos el resultado por pantalla del valor del texto introducido
        puntuacionFinal = contadorLetra * numIntroducido;
        System.out.println("El valor del texto es: " + puntuacionFinal);


    }
}
