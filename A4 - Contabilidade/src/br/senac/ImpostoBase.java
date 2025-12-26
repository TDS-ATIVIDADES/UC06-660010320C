package br.senac;

public abstract class ImpostoBase implements Imposto {
    private String descricao;

    public ImpostoBase(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
