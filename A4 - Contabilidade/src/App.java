import java.util.Scanner;

import br.senac.IPI;
import br.senac.PIS;
import br.senac.Pagamento;

public class App {
    public static void main(String[] args) {
        limparTela();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome da empresa: ");
        String nomeEmpresa = scanner.nextLine();
        Pagamento pagamentos = new Pagamento(nomeEmpresa);

        while (true) {
            limparTela();
            System.out.println("Informe o tipo de imposto (PIS, IPI) ou 'pare' para encerrar: ");
            String tipo = scanner.nextLine();

            if (tipo.equalsIgnoreCase("pare")) {
                break;
            }

            switch (tipo.toUpperCase()) {
                case "PIS":
                    System.out.println("Informe o valor total de débito: ");
                    double debito = scanner.nextDouble();
                    System.out.println("Informe o valor total de crédito: ");
                    double credito = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a nova linha

                    PIS pis = new PIS(debito, credito);
                    pagamentos.adicionarImposto(pis);
                    break;

                case "IPI":
                    System.out.println("Informe a alíquota: ");
                    double aliquota = scanner.nextDouble();
                    System.out.println("Informe o valor do produto: ");
                    double valorProduto = scanner.nextDouble();
                    System.out.println("Informe o frete: ");
                    double frete = scanner.nextDouble();
                    System.out.println("Informe o seguro: ");
                    double seguro = scanner.nextDouble();
                    System.out.println("Informe outras despesas: ");
                    double outrasDespesas = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a nova linha

                    IPI ipi = new IPI(aliquota, valorProduto, frete, seguro, outrasDespesas);
                    pagamentos.adicionarImposto(ipi);
                    break;

                default:
                    System.out.println("Tipo de imposto inválido.");
                    break;
            }
        }

        limparTela();
        System.out.println("Impostos cadastrados:");
        pagamentos.mostrarImpostos();

        scanner.close();
    }

    public static void limparTela()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
