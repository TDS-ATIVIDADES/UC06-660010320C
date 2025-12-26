package br.senac;

public class PIS extends ImpostoBase {
    private double debito;
    private double credito;
    private static final double ALIQUOTA = 0.0165;

    public PIS(double debito, double credito) {
        super("PIS");
        this.debito = debito;
        this.credito = credito;
    }

    @Override
    public double calcular() {
        return (debito - credito) * ALIQUOTA;
    }

    // Getters and setters
    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
