package br.senac;

import java.util.ArrayList;
import java.util.List;

public class Pagamento {
    private String nomeEmpresa;
    private List<Imposto> impostos;

    public Pagamento(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.impostos = new ArrayList<>();
    }

    public void adicionarImposto(Imposto imposto) {
        impostos.add(imposto);
    }

    public void mostrarImpostos() {
        for (Imposto imposto : impostos) {
            System.out.println(imposto.getDescricao() + ": " + imposto.calcular());
        }
    }

    // Getters and setters
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public List<Imposto> getImpostos() {
        return impostos;
    }

    public void setImpostos(List<Imposto> impostos) {
        this.impostos = impostos;
    }
}
