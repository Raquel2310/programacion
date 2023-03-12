
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
            System.out.println("\nMen�:");
            System.out.println("1. Mostrar valor en posici�n de array");
            System.out.println("2. Calcular letra del DNI");
            System.out.println("3. Mostrar valor m�ximo y m�nimo de array");
            System.out.println("4. Operar con array din�mico");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opci�n: ");
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
                    System.out.println("�Hasta luego!");
                    break;
                default:
                    System.out.println("Opci�n inv�lida. Por favor, intente de nuevo.");
                    break;
            }
            
        } while (opcion != 5);
    }
    
    // M�todo para mostrar valor en posici�n de array
    public static void mostrarValorPosicionArray() {
        int[] numeros = new int[10]; //Array de tipo int llamado numeros tiene memoria para 10 enteros
        
        // Inicializar array con n�meros aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 100) + 1;
        }
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una posici�n del array (0-9): ");
        int posicion = teclado.nextInt();
        
        if (posicion >= 0 && posicion <= 9) {
            System.out.println("El valor en la posici�n " + posicion + " es: " + numeros[posicion]);
        } else {
            System.out.println("Posici�n inv�lida. Por favor, intente de nuevo.");
        }
    }
    
    // M�todo para calcular letra del DNI
    public static void calcularLetraDNI() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su n�mero de DNI (sin letra): ");
        int dni = teclado.nextInt();
        //Array de tipo char llamado letras 
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = dni % 23; 
        
        System.out.println("Su DNI completo es: " + dni + "-" + letras[resto]);
    }
    
// M�todo para mostrar valor m�ximo y m�nimo de array
public static void mostrarMaximoMinimoArray() {
    int[] numeros = new int[15]; //Array de tipo int llamado numeros tiene memoria para 15 enteros
    
    // Inicializar array con n�meros aleatorios
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
    
    System.out.println("El valor m�ximo del array es: " + maximo);
    System.out.println("El valor m�nimo del array es: " + minimo);
}

// M�todo para operar con array din�mico
public static void operarConArrayDinamico() { // recorrer array unidimensional con bucle do while usando variables
    List<Integer> numeros = new ArrayList<>(); // como almacena datos de tipo basico especificamos 
    //el nombre de la clase asociada, en este caso integer
    Scanner teclado = new Scanner(System.in);
    int num;
    do {
        System.out.print("Introduce un n�mero entero (-999 para terminar): ");
        num = teclado.nextInt();
        if (num != -999) {
            numeros.add(num);
        }
    } while (num != -999);
    
    if (numeros.isEmpty()) {
        System.out.println("El array est� vac�o.");
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
        
        System.out.println("La suma de los n�meros es: " + suma);
        System.out.println("La media de los n�meros es: " + media);
        System.out.println("El valor m�ximo del array es: " + maximo);
        System.out.println("El valor m�nimo del array es: " + minimo);
    }
}
}