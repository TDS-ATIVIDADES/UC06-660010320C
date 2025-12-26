package br.senac;

public class PacoteViagem {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantidadeDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
    }

    public double calcularTotalHospedagem() {
        return quantidadeDias * hospedagem.getValorDiaria();
    }

    public double calcularValorLucro(double margem) {
        double totalHospedagem = calcularTotalHospedagem();
        double totalTransporte = transporte.getValor();
        double totalPacote = totalHospedagem + totalTransporte;
        return totalPacote * (1 + margem / 100);
    }

    public double calcularTotalPacote(double margem, double taxasAdicionais) {
        double totalLucro = calcularValorLucro(margem);
        return totalLucro + taxasAdicionais;
    }

    public String getDestino() {
        return destino;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }
}
