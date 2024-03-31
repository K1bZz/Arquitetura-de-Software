import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {

    public static void main(String[] args) {
        System.out.println("Converter Celsius para Fahrenheit:");
        System.out.println("Digite a temperatura em Celsius:");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double temperatura = scanner.nextDouble();

        double resultado = temperatura * 1.8 + 32; // Utilizei o double para realizar operação de multiplicação

        System.out.println("A temperatura em Fahrenheit é: " + resultado + "°F");
    }
}
