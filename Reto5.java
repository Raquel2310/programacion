
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAM
 */
public class Reto5 {

    public static void main (String[]args){
        Scanner teclado=new Scanner(System.in);
int opcion;
       
       
       do {
            System.out.println("Menú principal:");
            System.out.println("1. Contar palabras");
            System.out.println("2. Cambiar cadena número de telefono");
            System.out.println("3.Ingrese una opción, SI INTRODUCES 3 FINALIZA:");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
 
    
            switch (opcion) {

                 case 1:
                    String frase= teclado.nextLine();  
                     System.out.println("HAS ELEGIDO LA OPCIÓN CONTAR PALABRAS");
                     System.out.println("----------------------------");
                     System.out.println("Ingrese una frase:");
                     System.out.println("**************************");
                     String cadena = teclado.nextLine();
        int palabras = contarPalabras(cadena); 
                     System.out.println("La frase tiene " + palabras + " palabra(s).");
                     
                     
break;

                 case 2:
                    String telefono= teclado.nextLine();
                     System.out.println("HAS ELEGIDO LA OPCIÓN CAMBIAR CADENA DE NUMERO DE TELEFONO");
                     
                     System.out.println("----------------------------");
                     System.out.println("Ingrese número telefónico:");
                     System.out.println("**************************");
                     String numero = teclado.nextLine();
                     String numeroFormateado = formatearNumero(numero);
                     System.out.println("Número de telefono: " + numero);
                     System.out.println("Nueva Cadena: " + numeroFormateado);
break;
                case 3:
                    System.out.println("Hasta pronto! :) ");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo");
                    break;
            }
            
        } while (opcion != 3);
        
        teclado.close();
    }

    private static int contarPalabras(String cadena) {
          int palabras = 0;
          boolean dentroPalabra = false;
        
        for (int i = 0; i < cadena.length(); i++) { //devuelve el numero entero que representa la longitud de la cadena//
        if (cadena.charAt(i) == ' ') {
                dentroPalabra = false;
      } else if (!dentroPalabra) {
                dentroPalabra = true;
                palabras++;
            }
        }
        
        return palabras;
    }

    private static String formatearNumero(String numero) {
        String nuevaCadena = "(" + numero.substring(0, 2) + ")-"; // Uso substring para extraer una parte de una cadena 
        nuevaCadena += numero.substring(2, 5) + "-";
        nuevaCadena += numero.substring(5, 7) + " -";
        nuevaCadena += numero.substring(7);
        return nuevaCadena;
    }
}
             