import java.util.Scanner;

public class Practica7 {
    public static void main( String args [] )
    {
        metodo();
    }


    public static void metodo(){
        Scanner sc = new Scanner(System.in);
        Double espaciorecorrido = 5.5; 
        Double velocidad = 3.2;

        System.out.print ("Escribe los segundos: ");
        Double numero = sc.nextDouble();


        Double calculo = espaciorecorrido + (velocidad * numero);
        System.out.print("La distancia es: " + calculo);
    }

}
