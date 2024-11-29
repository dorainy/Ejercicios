import java.util.Scanner;
public class operaciones
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("Eliga una opcion: ");
        int opcion =  scanner.nextInt();
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        switch(opcion){
            case 1:
               System.out.println("El resultado de la suma es: " + (num1 + num2));
               break;
            case 2: 
               System.out.println("El resultado de la resta es: " + (num1 - num2));
               break;
            case 3: 
                 System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
               break;
            case 4: 
                if(num2 != 0) {
                 System.out.println("El resultado de la division es: " + (num1 / num2));
            
                } else{
                  System.out.println("La division no se puede hacer");
                }
                break;
            default:
                System.out.println("La opcion no es valida");
                break;
        }
    }
}