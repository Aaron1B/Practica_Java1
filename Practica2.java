import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        double numero = sc.nextDouble();

        double multiplicacion = numero * 20;
        System.out.println("Resultado 1: " + (multiplicacion / 10));

        double multiplicacion2 = numero + multiplicacion;
        System.out.println("Resultado 2: " + (multiplicacion2 / 10));

        double resto = multiplicacion2 % 10; 

        if (resto != 0) {
            System.out.println("Resto: " + resto);
        }

    }
}
