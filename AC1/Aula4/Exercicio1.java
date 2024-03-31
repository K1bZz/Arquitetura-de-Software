import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        System.out.println("Raiz Cúbica:");
        System.out.println("Digite o número que deseja saber a raiz cúbica:");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);// Utilizei o Locale.us para o scanner conseguir
                                                                      // ler o "." caso o usúario quiser utilizar
                                                                      // número decimal.
        double numero = scanner.nextDouble(); // Utilizei o double para o scanner conseguir receber casas decimais e
                                              // enviar um número maior de casas decimais na resposta

        System.out.println("O resultado da Raiz Cúbica de " + numero + " + " + " é: " + Math.cbrt(numero));

    }
}