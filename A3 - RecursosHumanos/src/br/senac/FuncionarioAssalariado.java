package br.senac;

public class FuncionarioAssalariado extends Funcionario {
    private double salarioMensal;

    public FuncionarioAssalariado(String nome, String cpf, String endereco, String telefone, String setor, double salarioMensal) {
        super(nome, cpf, endereco, telefone, setor);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularPagamento() {
        return salarioMensal;
    }

    @Override
    public void aplicarAumento(double percentual) {
        salarioMensal += salarioMensal * percentual / 100;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Salário Mensal: " + salarioMensal);
    }
}
