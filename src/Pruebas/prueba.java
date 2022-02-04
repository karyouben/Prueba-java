package Pruebas;



import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        
        // Constantes
        final int FECHA_ACTUAL = 2021;

        
        // Variables de entrada
        int año; // Valor del año introducido
   
        
        // Variables de salida
        String añoActual;           // Indica si el año introducido es anterior, posterior o coincide con el actual
        String siglo;               // Indica el siglo al que pertenece el año introducido
        String diferenciaAños = ""; // Indica la diferencia de años que hay entre el año introducido y el actual
  
        
        // Variables auxiliares
        int calculoAños; // Cálculo de la diferencia de años

        
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("ANÁLISIS DEL AÑO");
        System.out.println("----------------");
        
        // Le pedimos al usuario que introduzca un año comprendido entre 1801-2100
        System.out.print("Introduzca un año (entre 1801-2100): ");
        año = teclado.nextInt(); 

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        //Cálculo del periodo al que pertenece el año, siglo y diferencia de años según el año introducido
        calculoAños = (FECHA_ACTUAL - año);
        if (año < 1801 || año > 2100){
            añoActual = ("no es válido."); siglo = ("");
        } else  if (año < 1901) {
                añoActual = ("es anterior al actual. "); siglo = ("El año pertenece al siglo XIX");
                diferenciaAños = ("Han pasado " + calculoAños + " años.");
            } else if (año < 2001) {
                añoActual = ("es anterior al actual. "); siglo = ("El año pertenece al siglo XX"); 
                diferenciaAños = ("Han pasado " + calculoAños + " años.");
                } else if (año < 2021) {
                    añoActual = ("es anterior al actual. "); siglo = ("El año pertenece al siglo XXI"); 
                    diferenciaAños = ("Han pasado " + calculoAños + " años.");
                    } else if (año == 2021) {
                        añoActual = ("coincide con el actual. "); siglo = ("El año pertenece al siglo XXI");  
                        diferenciaAños = ("");                  
                        } else {
                            añoActual = ("es posterior al actual. "); siglo = ("El año pertenece al siglo XXI");  
                            diferenciaAños = ("Faltan " + -1*calculoAños + " años."); 
        }    
        
     
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        
        // Mostramos por pantalla el periodo, siglo y diferencia de años que hay con el año introducido
        System.out.println ("El año introducido " + añoActual + "" + diferenciaAños);
        System.out.println (siglo);





    }
}
