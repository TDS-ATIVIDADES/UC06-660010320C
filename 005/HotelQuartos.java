import java.util.Scanner;

public class HotelQuartos {

    final static int ANDARES = 4;
    final static int QUARTOS_POR_ANDAR = 3;
    final static String VISUALIZAR_TABELA = "N";

    private static boolean[][] quartosOcupados = new boolean[ANDARES][QUARTOS_POR_ANDAR];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Registrar ocupações
        while (true) {
            limparTela();
            System.out.println("Informe o andar (1 a " + ANDARES + "):");
            int andar = scanner.nextInt();
            System.out.println("Informe o número do quarto (1 a " + QUARTOS_POR_ANDAR + "):");
            int quarto = scanner.nextInt();

            limparTela();
            // Marca o quarto como ocupado
            if (andar >= 1 && andar <= 4 && quarto >= 1 && quarto <= 3) {
                quartosOcupados[andar - 1][quarto - 1] = true;
            } else {
                System.out.println("Número de andar ou quarto inválido.");
            }

            // Pergunta se deseja informar outra ocupação
            System.out.println("Deseja informar outra ocupação? (S/N)");
            scanner.nextLine(); // Limpa o buffer do scanner
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase(VISUALIZAR_TABELA)) {
                break;
            }
        }

        limparTela();

        // Exibir tabela de ocupação
        System.out.println("Tabela de ocupação:");
        for (int i = 3; i >= 0; i--) { // Começa do último andar para o primeiro
            System.out.print("Andar " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                if (quartosOcupados[i][j]) {
                    System.out.print("[X] ");
                } else {
                    System.out.print("[O] ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
