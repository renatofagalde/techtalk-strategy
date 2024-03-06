package br.com.topdown.techtalk.service;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;

import java.util.List;

public class XMLService {
    public void criarRelatorio(List pessoas){

        try {
            XmlMapper xmlMapper = new XmlMapper();
            String xml = xmlMapper.writeValueAsString(pessoas);
            System.out.println(xml);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
