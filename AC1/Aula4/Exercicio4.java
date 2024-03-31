import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {

    public static void main(String[] args) {
        System.out.println("Calcular Área do Quadrado:");
        System.out.println("Digite o valor do lado do quadrado em centimetros:");

        Scanner scannerLado = new Scanner(System.in).useLocale(Locale.US);
        float lado = scannerLado.nextFloat();

        float resultado = lado * lado;

        System.out.println("A Área do Quadrado é: " + resultado + "cm² ou " + resultado / 100 + "m²");
    }
}
