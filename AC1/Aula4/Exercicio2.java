import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        System.out.println("Calcular Perímetro do Retângulo:");
        System.out.println("Digite o valor da base do retângulo em centimetros:");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Utilizei o Locale.us para o scanner conseguir
                                                                       // ler o "." caso o usúario quiser/precisar
                                                                       // utilizar número decimal.
        float base = scanner.nextFloat(); // Utilizei o float para o scanner conseguir receber casas decimais

        System.out.println("Digite o valor da altura do retângulo em centrimetros:");
        float altura = scanner.nextFloat();

        float resultado = 2 * (base + altura);

        System.out.println("O perímetro do Retângulo é: " + resultado + "cm ou " + resultado / 100 + "m");

    }
}