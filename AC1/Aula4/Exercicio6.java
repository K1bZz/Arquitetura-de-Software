import java.util.Scanner;
import java.util.Locale;

public class Exercicio6 {

    public static void main(String[] args) {
        System.out.println("Calcular Juros Simples");
        System.out.println("Digite o valor em R$ que deseja calcular:");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        float capital = scanner.nextFloat();

        System.out.println("Digite o valor da Taxa de Juros em %:");

        float juros = scanner.nextFloat();

        System.out.println("Deseja calcular:");
        System.out.println("Opção 1 - ao Ano");
        System.out.println("Opção 2 - ao Mês");

        float AnoMes = scanner.nextFloat();
        if (AnoMes == 1) { // Utilizei o if else não pela função diferente, mas sim pela interpretação de
                           // texto
            float jurosano = juros / 100;
            System.out.println("Digite o número de anos a ser calculado:");
            int tempo = scanner.nextInt();

            float resultado = capital * jurosano * tempo;

            System.out.println("O juros baseado no valor é de: " + resultado + " Reais");
            System.out.println("Sendo a porcentagem equivalente a " + juros / 12 + "% ao mês");

        } else if (AnoMes == 2) {
            float jurosmes = juros / 100;

            System.out.println("Digite o número de meses a ser calculado:");

            int tempo = scanner.nextInt();

            float resultado = capital * jurosmes * tempo;

            System.out.println("O juros baseado no valor é de: " + resultado + " Reais em " + tempo + " Meses");
            System.out.println("Sendo a porcentagem equivalente a " + juros + "% ao mês");

        }

    }
}
