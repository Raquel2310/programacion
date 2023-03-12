
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAM
 */
public class Reto4Combinar {
    public static void main (String[]args){
        Scanner teclado=new Scanner(System.in);
String opcion = " ";
       int x,num1,num2,num3,num4,suma,producto,promedio,lado,valor = 0,perímetro,diferencia,div;
       x=1;
       suma=0;
       
       do {
            System.out.println();
            System.out.print("Menú Principal"
                    + "\nA.Opción letra(Introduzca letra A):\n"
                   
                    + "1.Opción número(Introduza número 1):"
                  
                    + "\nIngrese una opción, SI INTRODUCES 0 FINALIZA: ");
            // con la función toUppercase() ponemos en mayúscula la opción que introduzca el usuario evitando tener 2 opciones en el switch
            opcion = teclado.nextLine().toUpperCase();
    
            switch (opcion) {

                 case "A" -> {
                     System.out.println("HAS ELEGIDO LA OPCIÓN LETRA");
                     
                     System.out.println("----------------------------");
                     System.out.println("Ingrese 4 valores-");
                     System.out.println("**************************");
                     System.out.print("Ingrese valor 1:");
                     num1=teclado.nextInt();
                     System.out.print("Ingrese valor 2:");
                     num2=teclado.nextInt();
                     System.out.print("Ingrese valor 3:");
                     num3=teclado.nextInt();
                     System.out.print("Ingrese valor 4:");
                     num4=teclado.nextInt();
                     
                     suma=num1 + num2;
                     producto=num3 * num4;
                     
                     System.out.println("La suma de los dos primeros valores es:"+suma);
                     System.out.println("El producto de los valores 3 y 4 es:"+producto);
                     
                     
                     System.out.println("----------------------------");
                     System.out.println("Ingrese 4 valores:");
                     System.out.println("**************************");
                     System.out.print("Ingrese valor 1:");
                     num1=teclado.nextInt();
                     System.out.print("Ingrese valor 2:");
                     num2=teclado.nextInt();
                     System.out.print("Ingrese valor 3:");
                     num3=teclado.nextInt();
                     System.out.print("Ingrese valor 4:");
                     num4=teclado.nextInt();
                     suma=num1 + num2 + num3 + num4;
                     promedio=suma/4;
                     System.out.println("La suma de los 4 valores es:"+suma);
                     System.out.println("El promedio de los cuatro valores es:"+promedio);
                     
                     System.out.println("----------------------------");
                     System.out.print("Ingrese el valor del lado del cuadrado:");
                     lado=teclado.nextInt();
                     perímetro=lado * 4;
                     System.out.println("EL perímetro del cuadrado es:"+perímetro);
                     
                     System.out.println("----------------------------");
                     System.out.println("Ingrese 2 valores:");
                     System.out.println("**************************");
                     System.out.print("Ingrese valor 1:");
                     num1=teclado.nextInt();
                     System.out.print("Ingrese valor 2:");
                     num2=teclado.nextInt();
                     if (num1>num2) {
                         suma=num1 + num2;
                         diferencia=num1-num2;
                         System.out.println("La suma de los dos valores es:"+suma);
                         System.out.println("La diferencia de los dos valores es:"+diferencia);
                     } else {
                         producto=num1 * num2;
                         div=num1/num2;
                         System.out.println("El producto del primer valor respecto al segundo es:"+producto);
                         System.out.println("La división del primer valor respecto al segundo es:"+div);
                     }
                     
                     System.out.println("----------------------------");
                     System.out.println("Ingrese 3 valores, se mostrará el mayor de ellos:");
                     System.out.println("**************************");
                     System.out.print("Ingrese primer valor:");
                     num1=teclado.nextInt();
                     System.out.print("Ingrese segundo valor:");
                     num2=teclado.nextInt();
                     System.out.print("Ingrese el tercer valor:");
                     num3=teclado.nextInt();
                     
                     
                     if (num1>num2 && num1>num3){
                         System.out.println("El número mayor es el primero:"+num1);
                     } else if (num2>num3) {
                         System.out.println("El número mayor es el segundo:"+num2);
                     }else{
                         System.out.println("El número mayor es el tercero:"+num3);
                     }
                }
                 case "1" -> {
                     System.out.println("HAS ELEGIDO LA OPCIÓN NÚMERO");
                     
                     System.out.println("----------------------------");
                     System.out.println("Ingrese 4 valores-");
                     System.out.println("**************************");
                     System.out.print("Ingrese valor 1:");
                     num1=teclado.nextInt();
                     System.out.print("Ingrese valor 2:");
                     num2=teclado.nextInt();
                     System.out.print("Ingrese valor 3:");
                     num3=teclado.nextInt();
                     System.out.print("Ingrese valor 4:");
                     num4=teclado.nextInt();
                     
                     suma=num1 + num2;
                     producto=num3 * num4;
                     
                     System.out.println("La suma de los dos primeros valores es:"+suma);
                     System.out.println("El producto de los valores 3 y 4 es:"+producto);
                     
                     
                     System.out.println("----------------------------");
                     System.out.println("Ingrese 4 valores:");
                     System.out.println("**************************");
                     System.out.print("Ingrese valor 1:");
                     num1=teclado.nextInt();
                     System.out.print("Ingrese valor 2:");
                     num2=teclado.nextInt();
                     System.out.print("Ingrese valor 3:");
                     num3=teclado.nextInt();
                     System.out.print("Ingrese valor 4:");
                     num4=teclado.nextInt();
                     suma=num1 + num2 + num3 + num4;
                     promedio=suma/4;
                     System.out.println("La suma de los 4 valores es:"+suma);
                     System.out.println("El promedio de los cuatro valores es:"+promedio);
                     
                     System.out.println("----------------------------");
                     System.out.print("Ingrese el valor del lado del cuadrado:");
                     lado=teclado.nextInt();
                     perímetro=lado * 4;
                     System.out.println("EL perímetro del cuadrado es:"+perímetro);
                     
                     System.out.println("----------------------------");
                     System.out.println("Ingrese 2 valores:");
                     System.out.println("**************************");
                     System.out.print("Ingrese valor 1:");
                     num1=teclado.nextInt();
                     System.out.print("Ingrese valor 2:");
                     num2=teclado.nextInt();
                     if (num1>num2) {
                         suma=num1 + num2;
                         diferencia=num1-num2;
                         System.out.println("La suma de los dos valores es:"+suma);
                         System.out.println("La diferencia de los dos valores es:"+diferencia);
                     } else {
                         producto=num1 * num2;
                         div=num1/num2;
                         System.out.println("El producto del primer valor respecto al segundo es:"+producto);
                         System.out.println("La división del primer valor respecto al segundo es:"+div);
                     }
                     
                     System.out.println("----------------------------");
                     System.out.println("Ingrese 3 valores, se mostrará el mayor de ellos:");
                     System.out.println("**************************");
                     System.out.print("Ingrese primer valor:");
                     num1=teclado.nextInt();
                     System.out.print("Ingrese segundo valor:");
                     num2=teclado.nextInt();
                     System.out.print("Ingrese el tercer valor:");
                     num3=teclado.nextInt();
                     
                     
                     if (num1>num2 && num1>num3){
                         System.out.println("El número mayor es el primero:"+num1);
                     } else if (num2>num3) {
                         System.out.println("El número mayor es el segundo:"+num2);
                     }else{
                         System.out.println("El número mayor es el tercero:"+num3);
                     }
                }
                      default -> System.out.println("OPCIÓN NO VALIDA");
               }

       }while (!opcion.equals("0"));

       System.out.print("HAS FINALIZADO EL PROGRAMA");
     }
}  