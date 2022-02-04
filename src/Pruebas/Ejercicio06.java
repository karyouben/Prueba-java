package Pruebas;

public class Ejercicio06 {
    
    // Definición del enum
    public enum Provincias {ALMERIA, CADIZ, CORDOBA, GRANADA, HUELVA, JAEN, MALAGA, SEVILLA}

    
    // Programa principal
    public static void main(String[] args) {
     
             
        System.out.println ("PROVINCIAS DE ANDALUCÍA");
        System.out.println ("-----------------------");
        
               
        // Vamos mostrando cada uno de los posibles valores del enum
        System.out.println ("provincia 1: " + Provincias.ALMERIA);
        System.out.println ("provincia 2: " + Provincias.CADIZ);
        System.out.println ("provincia 3: " + Provincias.CORDOBA);
        System.out.println ("provincia 4: " + Provincias.GRANADA);
        System.out.println ("provincia 5: " + Provincias.HUELVA);
        System.out.println ("provincia 6: " + Provincias.JAEN);
        System.out.println ("provincia 7: " + Provincias.MALAGA);
        System.out.println ("provincia 8: " + Provincias.SEVILLA);
        
        
        // (no hace falta estructurar el programa en entrada/procesamiento/salida)

    }
    
}

