package br.com.topdown.techtalk.service.relatorio;

import br.com.topdown.techtalk.model.Pessoa;
import com.google.gson.Gson;

import java.util.List;

public class JSONService extends Relatorio{

    public static final String JSON = "json";

    public JSONService() {
        this.tipo= JSON;
    }

    @Override
    public void criarRelatorio(List<Pessoa> pessoas) {
        Gson gson = new Gson();
        String jsonArray = gson.toJson(pessoas);
        System.out.println(jsonArray);
    }
}
