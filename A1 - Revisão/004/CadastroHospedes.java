import java.util.Scanner;

public class CadastroHospedes {
    final static int QUANTIDADE_HOSPEDES = 15;

    final static String OPCAO_CADASTRAR = "1";
    final static String OPCAO_PESQUISAR = "2";
    final static String OPCAO_SAIR = "3";

    private static String[] hospedes = new String[QUANTIDADE_HOSPEDES];
    private static int quantidadeHospedes = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String opcao = montarMenu(scanner);
            
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case OPCAO_CADASTRAR:
                    // Cadastrar hóspede
                    cadastrarHospede(scanner);
                    break;
                case OPCAO_PESQUISAR:
                    // Pesquisar hóspede
                    pesquisarHospede(scanner);
                    break;
            }

            if (opcao.equals(OPCAO_SAIR)) {
                System.out.println("Saindo do programa...");
                break;
            }
        }

    }

    private static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static String montarMenu(Scanner scanner) {
        limparTela();
        System.out.println("Menu:");
        System.out.println(OPCAO_CADASTRAR + " - Cadastrar");
        System.out.println(OPCAO_PESQUISAR + " - Pesquisar");
        System.out.println(OPCAO_SAIR + " - Sair");
        System.out.print("Escolha uma opção: ");
        
        return scanner.next();
    }

    private static void cadastrarHospede(Scanner scanner) {
        limparTela();
        // Cadastrar hóspede
        if (quantidadeHospedes >= QUANTIDADE_HOSPEDES) {
            System.out.println("Máximo de cadastros atingido");
        } else {
            System.out.print("Digite o nome do hóspede: ");
            String nomeHospede = scanner.nextLine();
            if(nomeHospede == null || nomeHospede.isEmpty()) {
                System.out.println("Nome inválido");
            }
            else {
                hospedes[quantidadeHospedes] = nomeHospede;
                quantidadeHospedes++;
                System.out.println("Hóspede cadastrado com sucesso");
            }

            scanner.nextLine();
        }
    }

    private static void pesquisarHospede(Scanner scanner) {
        limparTela();
        // Pesquisar hóspede
        System.out.print("Digite o nome do hóspede para pesquisar: ");
        String nomePesquisa = scanner.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < quantidadeHospedes; i++) {
            if (hospedes[i].equalsIgnoreCase(nomePesquisa)) {
                System.out.println("Hóspede " + nomePesquisa + " foi encontrado no índice " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Hóspede não encontrado");
        }

        scanner.nextLine();
    }
}
