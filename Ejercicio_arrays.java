package JAVA;
import java.util.Scanner;
public class Ejercicio_arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        for( int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese el numero en la posicion " + i + ":");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }
        double promedio = suma /(double) numeros.length;
        System.out.println("El promedio es: " + promedio );
 
        
    }
}
