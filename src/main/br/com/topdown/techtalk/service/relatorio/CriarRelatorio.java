package br.com.topdown.techtalk.service.relatorio;

import br.com.topdown.techtalk.model.Pessoa;

import java.util.List;

public interface CriarRelatorio {
    void criarRelatorio(List<Pessoa> pessoas);
}
