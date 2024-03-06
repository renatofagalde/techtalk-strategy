package br.com.topdown.techtalk.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RelatorioServiceTest {

    private RelatorioService underTest;

    @BeforeEach
    void setup() {
        this.underTest = new RelatorioService();
    }

    @Test
    @DisplayName("Deve gerar o relatório")
    public void gerar() {

//        Boolean isGerado = this.underTest.gerar(null,null);
//        assertTrue(isGerado);
    }
}
