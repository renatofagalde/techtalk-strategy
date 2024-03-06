package br.com.topdown.techtalk.model;

public class Pessoa {
    private Integer id;
    private String name;
    private String email;
    private String ip;

    public Pessoa(Integer id, String name, String email, String ip) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.ip = ip;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getIp() {
        return ip;
    }
}
