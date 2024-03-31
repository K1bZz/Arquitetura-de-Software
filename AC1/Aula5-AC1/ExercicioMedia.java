import java.util.Scanner;
import java.util.Locale;

public class ExercicioMedia {
    public static void main(String[] args) {
        System.out.println("Calcular Media Final Facens:");
        System.out.println("Digite a nota da sua AC1:");

        Scanner scannerNota = new Scanner(System.in).useLocale(Locale.US); // Utilizei o Locale.us para o scanner
                                                                           // conseguir ler o "." caso o usúario
                                                                           // quiser/precisar utilizar número decimal.
        float AC1 = scannerNota.nextFloat(); // Utilizei o float para o scanner conseguir receber casas decimais

        System.out.println("Digite a nota da sua AC2:");

        float AC2 = scannerNota.nextFloat();

        System.out.println("Digite a nota da sua AG:");

        float AG = scannerNota.nextFloat();

        System.out.println("Digite a nota da sua AF:");

        float AF = scannerNota.nextFloat();

        double Media = (AC1 * 0.15) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45);

        System.out.println("Sua média final é: " + Media);

    }
}