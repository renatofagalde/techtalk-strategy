package br.com.topdown.techtalk.service.relatorio;

import br.com.topdown.techtalk.model.Pessoa;
import org.yaml.snakeyaml.Yaml;

import java.util.List;


public class YAMLService extends Relatorio{

    public static final String YAML = "yaml";

    public YAMLService() {
        this.tipo= YAML;
    }

    @Override
    public void criarRelatorio(List<Pessoa> pessoas) {
        Yaml yaml = new Yaml();

        String yamlString = yaml.dumpAs(pessoas,null,null);
        System.out.println("yamlString = " + yamlString);

    }
}
