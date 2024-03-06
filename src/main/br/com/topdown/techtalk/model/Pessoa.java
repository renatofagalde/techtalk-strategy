package br.com.topdown.techtalk.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;


@Builder
@Data
public class Pessoa {
    private String id;
    private String name;
    private String email;
    private String ip;
}
