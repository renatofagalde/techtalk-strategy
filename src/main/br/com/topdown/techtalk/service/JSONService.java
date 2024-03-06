package br.com.topdown.techtalk.service;

import com.google.gson.Gson;

import java.util.List;

public class JSONService {
    public void criarRelatorio(List pessoas){
        Gson gson = new Gson();
        String jsonArray = gson.toJson(pessoas);
        System.out.println(jsonArray);
    }
}
