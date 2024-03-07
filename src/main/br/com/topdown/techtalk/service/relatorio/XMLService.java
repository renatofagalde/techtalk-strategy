package br.com.topdown.techtalk.service.relatorio;

import br.com.topdown.techtalk.model.Pessoa;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;

import java.util.List;

public class XMLService extends Relatorio{

    public static final String XML = "xml";

    public XMLService() {
        this.tipo= XML;
    }

    @Override
    public void criarRelatorio(List<Pessoa> pessoas) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            String xml = xmlMapper.writeValueAsString(pessoas);
            System.out.println(xml);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
