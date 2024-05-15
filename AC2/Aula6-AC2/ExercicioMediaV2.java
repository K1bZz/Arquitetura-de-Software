import java.util.Scanner;
import java.util.Locale;

public class ExercicioMediaV2 {
    public static void main(String[] args) {
        Scanner scannerNota = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Calcular Média Final:");

        System.out.println("Digite qual a nota minima da média:");
        float minima = scannerNota.nextFloat();

        System.out.println("Digite a nota da sua AC1:");
        float AC1 = scannerNota.nextFloat();

        System.out.println("Digite a nota da sua AC2:");
        float AC2 = scannerNota.nextFloat();

        System.out.println("Digite a nota da sua AG:");
        float AG = scannerNota.nextFloat();

        System.out.println("Digite a nota da sua AF:");
        float AF = scannerNota.nextFloat();

        double Media = (AC1 * 0.15) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45);

        if (Media >= minima) {
            System.out.println("Sua Média Final é " + Media + " - Aprovado");
        } else {
            System.out.println("Sua Média Final é " + Media + " - Reprovado");
        }
    }
}