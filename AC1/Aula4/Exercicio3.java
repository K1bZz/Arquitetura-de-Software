import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {

    public static void main(String[] args) {
        System.out.println("Calcular Perímetro do Quadrado:");
        System.out.println("Digite o valor do lado do quadrado em centimetros:");

        Scanner scannerLado = new Scanner(System.in).useLocale(Locale.US);
        float lado = scannerLado.nextFloat();

        float resultado = 4 * lado;

        System.out.println("O perímetro do Quadrado é: " + resultado + "cm ou " + resultado / 100 + "m");
    }
}
