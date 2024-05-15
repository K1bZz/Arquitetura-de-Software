import java.util.Scanner;
import java.util.Locale;

public class ExercicioMediaV3 {
    public static void main(String[] args) {
        Scanner scannerNota = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Calcular Média Final:");

        System.out.println("Digite a nota da sua AC1:");
        float ac1 = scannerNota.nextFloat(); // Utilizei o float para o scanner conseguir receber casas decimais

        System.out.println("Digite a nota da sua AC2:");
        float ac2 = scannerNota.nextFloat();

        System.out.println("Digite a nota da sua AG:");
        float ag = scannerNota.nextFloat();

        System.out.println("Digite a nota da sua AF:");
        float af = scannerNota.nextFloat();

        double media = (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);

        if (media > 2 && media < 5) {
            System.out.println("Sua Média Final é " + media + " - Precisa Fazer Prova Substitutiva");
        } else if (media <= 2) {
            System.out.println("Sua Média Final é " + media + " - Reprovado");
        } else if (media >= 5 && media <= 10) {
            System.out.println("Sua Média Final é " + media + " - Aprovado");
        } else {
            System.out.println("Média Invalida");
        }
    }
}
