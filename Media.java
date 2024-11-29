
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class Media 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double number1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double number2 = scanner.nextDouble();
        System.out.println("Ingrese el tercer numero");
        double number3 = scanner.nextDouble();
        double media = (number1 + number2 + number3) /3;
        
        System.out.println("La media de los tres numeros es: " + media);
    }
}
