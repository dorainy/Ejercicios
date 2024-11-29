public class numerosPares
{
    public static void main(String[] args) {
        int contador = 0;
        
        for(int numPar = 1; numPar <= 100; numPar++) {
            if ( numPar % 2 ==0) {
                contador++;
            }
        }
       
        System.out.println("La cantidad de numeros pares es: " + contador );
    }
}