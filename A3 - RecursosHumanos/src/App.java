import java.util.ArrayList;
import java.util.Scanner;

import br.senac.Funcionario;
import br.senac.FuncionarioAssalariado;
import br.senac.FuncionarioHorista;

public class App {
    private static final int MAX_FUNCIONARIOS = 10;
    private static final int MAX_ASSALARIADOS = 5;
    private static final int MAX_HORISTAS = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int numAssalariados = 0;
        int numHoristas = 0;

        while (funcionarios.size() < MAX_FUNCIONARIOS) {
            limparTela();
            System.out.println("Informe o tipo de funcionário (1 para Assalariado, 2 para Horista): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            if (tipo == 1) {
                if (numAssalariados >= MAX_ASSALARIADOS) {
                    System.out.println("Máximo de funcionários assalariados atingido.");
                    continue;
                }
                FuncionarioAssalariado assalariado = criarFuncionarioAssalariado(scanner);
                funcionarios.add(assalariado);
                numAssalariados++;
            } else if (tipo == 2) {
                if (numHoristas >= MAX_HORISTAS) {
                    System.out.println("Máximo de funcionários horistas atingido.");
                    continue;
                }
                FuncionarioHorista horista = criarFuncionarioHorista(scanner);
                funcionarios.add(horista);
                numHoristas++;
            } else {
                System.out.println("Tipo inválido, tente novamente.");
            }
        }

        limparTela();
        mostrarDadosFuncionarios(funcionarios);

        System.out.println("Informe o percentual de aumento para todos os funcionários: ");
        double percentualAumento = scanner.nextDouble();

        limparTela();
        aplicarAumento(funcionarios, percentualAumento);
        mostrarDadosFuncionarios(funcionarios);

        scanner.close();
    }

    private static FuncionarioAssalariado criarFuncionarioAssalariado(Scanner scanner) {
        FuncionarioDados dadosComuns = obterDadosComuns(scanner);
        System.out.println("Informe o salário mensal: ");
        double salarioMensal = scanner.nextDouble();

        return new FuncionarioAssalariado(dadosComuns.nome, dadosComuns.cpf, dadosComuns.endereco,
                                          dadosComuns.telefone, dadosComuns.setor, salarioMensal);
    }

    private static FuncionarioHorista criarFuncionarioHorista(Scanner scanner) {
        FuncionarioDados dadosComuns = obterDadosComuns(scanner);
        System.out.println("Informe as horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.println("Informe o valor por hora: ");
        double valorHora = scanner.nextDouble();

        return new FuncionarioHorista(dadosComuns.nome, dadosComuns.cpf, dadosComuns.endereco,
                                      dadosComuns.telefone, dadosComuns.setor, horasTrabalhadas, valorHora);
    }

    private static FuncionarioDados obterDadosComuns(Scanner scanner) {
        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Informe o endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Informe o telefone: ");
        String telefone = scanner.nextLine();
        System.out.println("Informe o setor: ");
        String setor = scanner.nextLine();

        return new FuncionarioDados(nome, cpf, endereco, telefone, setor);
    }

    private static void mostrarDadosFuncionarios(ArrayList<Funcionario> funcionarios) {
        System.out.println("\nDados dos Funcionários e Pagamentos:");
        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
            System.out.println("Pagamento: " + funcionario.calcularPagamento());
            System.out.println();
        }
    }

    private static void aplicarAumento(ArrayList<Funcionario> funcionarios, double percentualAumento) {
        for (Funcionario funcionario : funcionarios) {
            funcionario.aplicarAumento(percentualAumento);
        }
    }

    private static class FuncionarioDados {
        String nome;
        String cpf;
        String endereco;
        String telefone;
        String setor;

        FuncionarioDados(String nome, String cpf, String endereco, String telefone, String setor) {
            this.nome = nome;
            this.cpf = cpf;
            this.endereco = endereco;
            this.telefone = telefone;
            this.setor = setor;
        }
    }

    public static void limparTela()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
