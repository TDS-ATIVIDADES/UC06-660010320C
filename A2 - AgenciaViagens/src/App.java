import java.util.Scanner;

import br.senac.Hospedagem;
import br.senac.PacoteViagem;
import br.senac.Transporte;
import br.senac.Venda;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obter dados do transporte
        limparTela();
        System.out.print("Informe o tipo de transporte (aéreo, rodoviário, marítimo etc.): ");
        String tipoTransporte = scanner.nextLine();
        System.out.print("Informe o valor do transporte: ");
        double valorTransporte = scanner.nextDouble();
        Transporte transporte = new Transporte(tipoTransporte, valorTransporte);

        limparTela();
        // Obter dados da hospedagem
        System.out.print("Informe a descrição da hospedagem: ");
        scanner.nextLine(); // Limpa o buffer do scanner
        String descricaoHospedagem = scanner.nextLine();
        System.out.print("Informe o valor da diária: ");
        double valorDiaria = scanner.nextDouble();
        Hospedagem hospedagem = new Hospedagem(descricaoHospedagem, valorDiaria);

        // Obter dados do pacote de viagem
        limparTela();
        System.out.print("Informe o destino: ");
        scanner.nextLine(); // Limpa o buffer do scanner
        String destino = scanner.nextLine();
        System.out.print("Informe a quantidade de dias: ");
        int quantidadeDias = scanner.nextInt();
        PacoteViagem pacoteViagem = new PacoteViagem(transporte, hospedagem, destino, quantidadeDias);

        // Obter margem de lucro e taxas adicionais
        System.out.print("Informe a margem de lucro (em %): ");
        double margem = scanner.nextDouble();
        System.out.print("Informe o valor das taxas adicionais: ");
        double taxasAdicionais = scanner.nextDouble();

        // Obter dados da venda
        limparTela();
        System.out.print("Informe o nome do cliente: ");
        scanner.nextLine(); // Limpa o buffer do scanner
        String nomeCliente = scanner.nextLine();
        System.out.print("Informe a forma de pagamento: ");
        String formaPagamento = scanner.nextLine();

        // Criar objeto venda
        Venda venda = new Venda(nomeCliente, formaPagamento, pacoteViagem);

        // Obter cotação do dólar
        limparTela();
        System.out.print("Informe a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        // Mostrar informações da venda
        limparTela();
        venda.mostrarInformacoes(cotacaoDolar, margem, taxasAdicionais);

        scanner.close();
    }

    public static void limparTela()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}
