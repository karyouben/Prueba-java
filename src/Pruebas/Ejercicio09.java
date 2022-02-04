package Pruebas;

import java.util.Scanner;

public class Ejercicio09 {
    
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaraci�n de variables 
        //----------------------------------------------

        // Constantes
        

        // Variables de entrada
        int precioProducto;    // Precio del producto
        int dineroIntroducido; // Importe introducido
        
        
        // Variables de salida
        int monedasVeinte;  // N�mero de monedas de veinte c�ntimos
        int monedasDiez;    // N�mero de monedas de diez c�ntimos
        int monedasCinco;   // N�mero de monedas de cinco c�ntimos
        int monedasDos;     // N�mero de monedas de dos c�ntimos
        int monedasUno;     // N�mero de monedas de un c�ntimo
        
        
        // Variables auxiliares
        int cambioProducto; // Importe del cambio del producto
        int cambioDiez;     // Importe del cambio para monedas de diez
        int cambioCinco;    // Importe del cambio para monedas de cinco
        int cambioDos;      // Importe del cambio para monedas de dos
        int cambioUno;      // Importe del cambio para monedas de uno
        int monedasTotales; // N�mero de monedas totales de 20,10,5,2 y 1
        
        

        // Clase Scanner para petici�n de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("M�QUINA EXPENDEDORA DE PRODUCTOS");
        System.out.println("--------------------------------");
        
        // Indicamos el precio del producto a comprar (en c�ntimos)
        System.out.println("Precio del producto (en c�ntimos): ");
        precioProducto = teclado.nextInt();
        
        // Indicamos el dinero introducido (en c�ntimos)
        System.out.println("Dinero introducido (en c�ntimos): ");
        dineroIntroducido = teclado.nextInt();
        
                
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // C�lculo aritm�tico para el cambio en monedas de 20,10,5,2 y 1
        
        
        // C�lculo del cambio tras la compra del producto
        cambioProducto = (dineroIntroducido - precioProducto); 
        // C�lculo del cambio en monedas de 20
        monedasVeinte  = (cambioProducto / 20); 
        
        // C�lculo del cambio restante para monedas de 10
        cambioDiez     = (cambioProducto - monedasVeinte * 20);
        // C�lculo del cambio en monedas de 10
        monedasDiez    = (cambioDiez / 10);
                
        // C�lculo del cambio restante para monedas de 5
        cambioCinco    = (cambioDiez - monedasDiez * 10);
        // C�lculo del cambio en monedas de 5
        monedasCinco   = (cambioCinco / 5);                  
                
        // C�lculo del cambio restante para monedas de 2
        cambioDos      = (cambioCinco - monedasCinco * 5);
        // C�lculo del cambio en monedas de 2
         monedasDos    = (cambioDos / 2);                   
                
        // C�lculo del cambio restante para monedas de 1
        cambioUno      = (cambioDos - monedasDos * 2);
        // C�lculo del cambio en monedas de 1
        monedasUno     = (cambioUno / 1); 
        
        // C�lculo de monedas totales
        monedasTotales = (monedasVeinte + monedasDiez + monedasCinco + monedasDos + monedasUno);
  
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        
        // Mostramos el cambio recibido (en c�ntimos)
        System.out.println("El cambio es: " + cambioProducto + " c�ntimos." );
        
        // Mostramos el n�mero de monedas de 20,10,5,2 y 1
        System.out.println("Monedas de 20 c�ntimos: " + monedasVeinte);
        System.out.println("Monedas de 10 c�ntimos: " + monedasDiez);
        System.out.println("Monedas de 5  c�ntimos: " + monedasCinco);
        System.out.println("Monedas de 2  c�ntimos: " + monedasDos);
        System.out.println("Monedas de 1  c�ntimos: " + monedasUno);
        System.out.println("Total de monedas: "       + monedasTotales);
        
    }    
}

