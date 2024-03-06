package br.com.topdown.techtalk.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RelatorioTest {

    private Relatorio underTest;

    @BeforeEach
    void setup() {
        this.underTest = new Relatorio();
    }

    @Test
    @DisplayName("Deve gerar o relatório")
    public void gerar() {

        Boolean isGerado = this.underTest.gerar();

        assertTrue(isGerado);
    }
}
