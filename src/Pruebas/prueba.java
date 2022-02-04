package Pruebas;



import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaraci�n de variables 
        //----------------------------------------------
        
        // Constantes
        final int FECHA_ACTUAL = 2021;

        
        // Variables de entrada
        int a�o; // Valor del a�o introducido
   
        
        // Variables de salida
        String a�oActual;           // Indica si el a�o introducido es anterior, posterior o coincide con el actual
        String siglo;               // Indica el siglo al que pertenece el a�o introducido
        String diferenciaA�os = ""; // Indica la diferencia de a�os que hay entre el a�o introducido y el actual
  
        
        // Variables auxiliares
        int calculoA�os; // C�lculo de la diferencia de a�os

        
        // Clase Scanner para petici�n de datos de entrada
        Scanner teclado = new Scanner(System.in);

        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("AN�LISIS DEL A�O");
        System.out.println("----------------");
        
        // Le pedimos al usuario que introduzca un a�o comprendido entre 1801-2100
        System.out.print("Introduzca un a�o (entre 1801-2100): ");
        a�o = teclado.nextInt(); 

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        //C�lculo del periodo al que pertenece el a�o, siglo y diferencia de a�os seg�n el a�o introducido
        calculoA�os = (FECHA_ACTUAL - a�o);
        if (a�o < 1801 || a�o > 2100){
            a�oActual = ("no es v�lido."); siglo = ("");
        } else  if (a�o < 1901) {
                a�oActual = ("es anterior al actual. "); siglo = ("El a�o pertenece al siglo XIX");
                diferenciaA�os = ("Han pasado " + calculoA�os + " a�os.");
            } else if (a�o < 2001) {
                a�oActual = ("es anterior al actual. "); siglo = ("El a�o pertenece al siglo XX"); 
                diferenciaA�os = ("Han pasado " + calculoA�os + " a�os.");
                } else if (a�o < 2021) {
                    a�oActual = ("es anterior al actual. "); siglo = ("El a�o pertenece al siglo XXI"); 
                    diferenciaA�os = ("Han pasado " + calculoA�os + " a�os.");
                    } else if (a�o == 2021) {
                        a�oActual = ("coincide con el actual. "); siglo = ("El a�o pertenece al siglo XXI");  
                        diferenciaA�os = ("");                  
                        } else {
                            a�oActual = ("es posterior al actual. "); siglo = ("El a�o pertenece al siglo XXI");  
                            diferenciaA�os = ("Faltan " + -1*calculoA�os + " a�os."); 
        }    
        
     
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        
        // Mostramos por pantalla el periodo, siglo y diferencia de a�os que hay con el a�o introducido
        System.out.println ("El a�o introducido " + a�oActual + "" + diferenciaA�os);
        System.out.println (siglo);





    }
}
