import java.util.Scanner;
import java.util.Locale;

public class ExercicioMediaV4 {
    public static void main(String[] args) {
        Scanner scannerNota = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Calcular Média Final!");

        System.out.print("Quantas notas você quer inserir? ");
        int quantidadeDeNotas = scannerNota.nextInt();

        double somaDasNotas = 0;
        double somaDosPesos = 0;

        for (int i = 1; i <= quantidadeDeNotas; i++) {
            System.out.println("Insira a nota " + i + ":");
            double nota = scannerNota.nextDouble();

            System.out.println("Insira o peso da nota " + i + " de 1% à 100% (digite apenas o número):");
            double peso = scannerNota.nextDouble();
            if (peso <= 0 && peso > 100) {
                peso = 10; // Valor padrão caso o úsuario informe uma % não permitida
            }

            somaDasNotas += nota * (peso / 100);
            somaDosPesos += (peso / 100);
        }

        double media = somaDasNotas * somaDosPesos;

        if (media > 2 && media < 5) {
            System.out.println("Sua Média Final é " + media + " - Precisa Fazer Prova Substitutiva");

        } else if (media <= 2) {
            System.out.println("Sua Média Final é " + media + " - Reprovado");

        } else if (media >= 5 && media <= 10) {
            System.out.println("Sua Média Final é " + media + " - Aprovado");

        } else {
            System.out.println("Média Invalida");

        }

        scannerNota.close();
    }
}