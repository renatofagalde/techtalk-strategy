package br.com.topdown.techtalk.service;

import br.com.topdown.techtalk.model.Pessoa;
import br.com.topdown.techtalk.service.relatorio.Relatorio;
import br.com.topdown.techtalk.service.relatorio.YAMLService;
import br.com.topdown.techtalk.service.relatorio.JSONService;
import br.com.topdown.techtalk.service.relatorio.XMLService;

import java.util.ArrayList;
import java.util.List;

public class RelatorioService {


    public static final String JSON = "json";
    public static final String XML = "xml";
    public static final String YAML = "yaml";

    List<Relatorio> relatorios = List.of(new JSONService(), new XMLService(), new YAMLService());

    public Boolean gerar(String tipo, List<Pessoa> pessoas) {

        Relatorio relatorio = relatorios.stream()
                .filter(r -> r.getTipo().equals(tipo))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);

        relatorio.criarRelatorio(pessoas);

        return Boolean.TRUE;
    }
}
