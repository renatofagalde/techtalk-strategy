package br.com.topdown.techtalk.service;

import br.com.topdown.techtalk.model.Pessoa;

import java.util.List;

public class RelatorioService {


    public static final String JSON = "json";
    public static final String XML = "xml";
    public static final String YAML = "yaml";

    public Boolean gerar(String tipo, List<Pessoa> pessoas) {

        if(tipo.equals(JSON)){
            new JSONService().criarRelatorio(pessoas);
        } else if (tipo.equals(XML)) {
            new XMLService().criarRelatorio(pessoas);
        } else if (tipo.equals(YAML)) {
            new YAMLService().criarRelatorio(pessoas);
        }
        return Boolean.TRUE;
    }
}
