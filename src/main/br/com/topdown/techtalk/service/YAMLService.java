package br.com.topdown.techtalk.service;

import br.com.topdown.techtalk.model.Pessoa;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.representer.Representer;

import java.io.ByteArrayInputStream;
import java.util.List;


public class YAMLService {
    public void criarRelatorio(List pessoas){


        Yaml yaml = new Yaml();

        String yamlString = yaml.dumpAs(pessoas,null,null);
        System.out.println("yamlString = " + yamlString);
    }
}
