
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class numeroMayor;
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int number1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int number2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero");
        int number3 = scanner.nextInt();
        
       
        if (number1 > number2 && number1 > number3 ){
            System.out.println("El numero mayor es: " + number1);
        } else if (number2 > number3 && number2 > number1){
            System.out.println("El numero mayor es: " + number2);
        } else{
            System.out.println("El numero mayor es: " + number3);
        }
    }
}
