package Pruebas;

import java.util.Scanner;

public class Ejercicio09 {
    
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes
        

        // Variables de entrada
        int precioProducto;    // Precio del producto
        int dineroIntroducido; // Importe introducido
        
        
        // Variables de salida
        int monedasVeinte;  // Número de monedas de veinte céntimos
        int monedasDiez;    // Número de monedas de diez céntimos
        int monedasCinco;   // Número de monedas de cinco céntimos
        int monedasDos;     // Número de monedas de dos céntimos
        int monedasUno;     // Número de monedas de un céntimo
        
        
        // Variables auxiliares
        int cambioProducto; // Importe del cambio del producto
        int cambioDiez;     // Importe del cambio para monedas de diez
        int cambioCinco;    // Importe del cambio para monedas de cinco
        int cambioDos;      // Importe del cambio para monedas de dos
        int cambioUno;      // Importe del cambio para monedas de uno
        int monedasTotales; // Número de monedas totales de 20,10,5,2 y 1
        
        

        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("MÁQUINA EXPENDEDORA DE PRODUCTOS");
        System.out.println("--------------------------------");
        
        // Indicamos el precio del producto a comprar (en céntimos)
        System.out.println("Precio del producto (en céntimos): ");
        precioProducto = teclado.nextInt();
        
        // Indicamos el dinero introducido (en céntimos)
        System.out.println("Dinero introducido (en céntimos): ");
        dineroIntroducido = teclado.nextInt();
        
                
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Cálculo aritmético para el cambio en monedas de 20,10,5,2 y 1
        
        
        // Cálculo del cambio tras la compra del producto
        cambioProducto = (dineroIntroducido - precioProducto); 
        // Cálculo del cambio en monedas de 20
        monedasVeinte  = (cambioProducto / 20); 
        
        // Cálculo del cambio restante para monedas de 10
        cambioDiez     = (cambioProducto - monedasVeinte * 20);
        // Cálculo del cambio en monedas de 10
        monedasDiez    = (cambioDiez / 10);
                
        // Cálculo del cambio restante para monedas de 5
        cambioCinco    = (cambioDiez - monedasDiez * 10);
        // Cálculo del cambio en monedas de 5
        monedasCinco   = (cambioCinco / 5);                  
                
        // Cálculo del cambio restante para monedas de 2
        cambioDos      = (cambioCinco - monedasCinco * 5);
        // Cálculo del cambio en monedas de 2
         monedasDos    = (cambioDos / 2);                   
                
        // Cálculo del cambio restante para monedas de 1
        cambioUno      = (cambioDos - monedasDos * 2);
        // Cálculo del cambio en monedas de 1
        monedasUno     = (cambioUno / 1); 
        
        // Cálculo de monedas totales
        monedasTotales = (monedasVeinte + monedasDiez + monedasCinco + monedasDos + monedasUno);
  
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        
        // Mostramos el cambio recibido (en céntimos)
        System.out.println("El cambio es: " + cambioProducto + " céntimos." );
        
        // Mostramos el número de monedas de 20,10,5,2 y 1
        System.out.println("Monedas de 20 céntimos: " + monedasVeinte);
        System.out.println("Monedas de 10 céntimos: " + monedasDiez);
        System.out.println("Monedas de 5  céntimos: " + monedasCinco);
        System.out.println("Monedas de 2  céntimos: " + monedasDos);
        System.out.println("Monedas de 1  céntimos: " + monedasUno);
        System.out.println("Total de monedas: "       + monedasTotales);
        
    }    
}

