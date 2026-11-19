import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

         System.out.print("Digite a segunda nota: ");
        double nota3 = scanner.nextDouble();
        
         System.out.print("Digite a segunda nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 +nota3 + nota4) / 2;

        String situacao;

        if (media >= 60) {
            situacao = "Aprovado";
        } else if (media >= 30 && media < 60) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        System.out.printf("Média: %.2f\n", media);
        System.out.println("Situação: " + situacao);

        scanner.close();
    }
}
