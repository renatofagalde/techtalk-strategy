package br.com.topdown.techtalk.service.relatorio;

public abstract class Relatorio implements CriarRelatorio{

    protected String tipo;

    public String getTipo() {
        return tipo;
    }
}
