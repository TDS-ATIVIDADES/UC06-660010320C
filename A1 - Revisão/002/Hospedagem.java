import java.util.Scanner;

public class Hospedagem {
    public static void main(String[] args) {
        limparTela();
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor padrão da diária
        System.out.println("Digite o valor padrão da diária (em R$):");
        double valorDiaria = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer do scanner

        int quantidadeGratuidades = 0;
        int quantidadeMeias = 0;
        double valorTotal = 0.0;

        while (true) {

            limparTela();
            // Entrada de dados do hóspede
            System.out.println("Digite o nome do hóspede (ou 'PARE' para terminar):");
            String nomeHospede = scanner.nextLine();
            if (nomeHospede.equalsIgnoreCase("PARE")) {
                break;
            }

            System.out.println("Digite a idade do hóspede:");
            int idadeHospede = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            // Verifica as condições de gratuidade e meia diária
            if (idadeHospede < 4) {
                System.out.println(nomeHospede + " possui gratuidade");
                quantidadeGratuidades++;
            } else if (idadeHospede > 80) {
                System.out.println(nomeHospede + " paga meia");
                quantidadeMeias++;
                valorTotal += valorDiaria / 2;
            } else {
                valorTotal += valorDiaria;
            }
        }

        scanner.close();
        
        limparTela();

        // Exibição dos resultados
        System.out.println("Total de hospedagens: R$" + valorTotal);
        System.out.println(quantidadeGratuidades + " gratuidade(s)");
        System.out.println(quantidadeMeias + " meia(s)");
    }

    private static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
