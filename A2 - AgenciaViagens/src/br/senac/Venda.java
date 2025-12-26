package br.senac;

import java.text.DecimalFormat;

public class Venda {
    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacoteViagem;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacoteViagem) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacoteViagem = pacoteViagem;
    }

    public double converterParaReais(double valorDolar, double cotacaoDolar) {
        return valorDolar * cotacaoDolar;
    }

    public void mostrarInformacoes(double cotacaoDolar, double margem, double taxasAdicionais) {
        double totalDolar = pacoteViagem.calcularTotalPacote(margem, taxasAdicionais);
        double totalReais = converterParaReais(totalDolar, cotacaoDolar);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Forma de Pagamento: " + formaPagamento);
        System.out.println("Destino: " + pacoteViagem.getDestino());
        System.out.println("Quantidade de Dias: " + pacoteViagem.getQuantidadeDias());
        System.out.println("Total do Pacote em Dólar: $" + df.format(totalDolar));
        System.out.println("Total do Pacote em Reais: R$" + df.format(totalReais));
    }
}
