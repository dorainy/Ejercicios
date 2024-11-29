import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int number = scanner.nextInt();
        
        int factorial = 1;
        int x = 1;
        while(x <= number){
            factorial *= x;
            x++;
        }
        System.out.println("El factorial es: " + factorial);
    }
}