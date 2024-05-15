import java.util.Scanner;
import java.util.Locale;

public class ExercicioMediaV6 {
    public static void main(String[] args) {
        Scanner scannerNota = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Calcular Média Final!");

        System.out.println("Quantos alunos você deseja inserir?");
        int quantidadeAlunos = scannerNota.nextInt();

        for (int i = 1; i <= quantidadeAlunos; i++) {

            System.out.print("Qual o nome do aluno(a) " + i + "? \n");
            String nomeAluno = scannerNota.next();

            System.out.print("Quantas notas você deseja inserir? \n");
            int quantidadeDeNotas = scannerNota.nextInt();

            double somaDasNotas = 0;
            double somaDosPesos = 0;

            for (int x = 1; x <= quantidadeDeNotas; x++) {
                double nota;
                double peso;
                boolean refazer = false;

                do {
                    System.out.println("Insira a nota " + x + ":");
                    nota = scannerNota.nextDouble();

                    System.out.println("Insira o peso da nota " + x + " de 1% à 100% (digite apenas o número):");
                    peso = scannerNota.nextDouble();

                    System.out.println("Deseja alterar a nota do aluno atual? (Digite 1 para Sim ou 0 para Não):");
                    int opcao = scannerNota.nextInt();

                    if (opcao == 1) {
                        refazer = true;
                    } else if (opcao == 0) {
                        refazer = false;
                    } else {
                        System.out.println("Opção inválida, digite novamente a nota");
                        refazer = true;
                    }
                } while (refazer);

                somaDasNotas += nota * (peso / 100);
                somaDosPesos += (peso / 100);
            }

            double media = somaDasNotas / somaDosPesos;

            if (media > 2 && media < 5) {
                System.out.println(nomeAluno + ", sua Média Final é " + media + " - Precisa Fazer Prova Substitutiva");

            } else if (media <= 2) {
                System.out.println(nomeAluno + ", sua Média Final é " + media + " - Reprovado");

            } else if (media >= 5 && media <= 10) {
                System.out.println(nomeAluno + ", sua Média Final é " + media + " - Aprovado");

            } else {
                System.out.println("Média Invalida");

            }
        }
        scannerNota.close();
    }
}