
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAQUEL
 */
public class Reto6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar valor en posición de array");
            System.out.println("2. Calcular letra del DNI");
            System.out.println("3. Mostrar valor máximo y mínimo de array");
            System.out.println("4. Operar con array dinámico");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    mostrarValorPosicionArray();
                    break;
                case 2:
                    calcularLetraDNI();
                    break;
                case 3:
                    mostrarMaximoMinimoArray();
                    break;
                case 4:
                    operarConArrayDinamico();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
                    break;
            }
            
        } while (opcion != 5);
    }
    
    // Método para mostrar valor en posición de array
    public static void mostrarValorPosicionArray() {
        int[] numeros = new int[10]; //Array de tipo int llamado numeros tiene memoria para 10 enteros
        
        // Inicializar array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 100) + 1;
        }
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una posición del array (0-9): ");
        int posicion = teclado.nextInt();
        
        if (posicion >= 0 && posicion <= 9) {
            System.out.println("El valor en la posición " + posicion + " es: " + numeros[posicion]);
        } else {
            System.out.println("Posición inválida. Por favor, intente de nuevo.");
        }
    }
    
    // Método para calcular letra del DNI
    public static void calcularLetraDNI() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su número de DNI (sin letra): ");
        int dni = teclado.nextInt();
        //Array de tipo char llamado letras 
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = dni % 23; 
        
        System.out.println("Su DNI completo es: " + dni + "-" + letras[resto]);
    }
    
// Método para mostrar valor máximo y mínimo de array
public static void mostrarMaximoMinimoArray() {
    int[] numeros = new int[15]; //Array de tipo int llamado numeros tiene memoria para 15 enteros
    
    // Inicializar array con números aleatorios
    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = (int)(Math.random() * 100) + 1;
    }
    
    int maximo = numeros[0];
    int minimo = numeros[0];
    
    for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] > maximo) {
            maximo = numeros[i];
        }
        if (numeros[i] < minimo) {
            minimo = numeros[i];
        }
    }
    
    System.out.println("El valor máximo del array es: " + maximo);
    System.out.println("El valor mínimo del array es: " + minimo);
}

// Método para operar con array dinámico
public static void operarConArrayDinamico() { // recorrer array unidimensional con bucle do while usando variables
    List<Integer> numeros = new ArrayList<>(); // como almacena datos de tipo basico especificamos 
    //el nombre de la clase asociada, en este caso integer
    Scanner teclado = new Scanner(System.in);
    int num;
    do {
        System.out.print("Introduce un número entero (-999 para terminar): ");
        num = teclado.nextInt();
        if (num != -999) {
            numeros.add(num);
        }
    } while (num != -999);
    
    if (numeros.isEmpty()) {
        System.out.println("El array está vacío.");
    } else {
        int suma = 0;
        int maximo = numeros.get(0); // usamos metodo get para obtener el 
        //elemento almacenado en la posicion 0 que esta con parametro int
        int minimo = numeros.get(0);
        
        for (int i = 0; i < numeros.size(); i++) { // usamos size para obtener
            //el numero de elementos de forma automatica //
            suma = numeros.get(i);
            if (numeros.get(i) > maximo) {
                maximo = numeros.get(i);
            }
            if (numeros.get(i) < minimo) {
                minimo = numeros.get(i);
            }
        }
        
        double media = (double)suma / numeros.size(); //Array de tipo double 
        
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La media de los números es: " + media);
        System.out.println("El valor máximo del array es: " + maximo);
        System.out.println("El valor mínimo del array es: " + minimo);
    }
}
}