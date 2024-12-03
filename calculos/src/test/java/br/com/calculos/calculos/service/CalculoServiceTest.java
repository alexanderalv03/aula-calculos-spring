package br.com.calculos.calculos.service;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculoServiceTest {

    @Autowired
    CalculosService calculoService;

    @Test
    void cenario01(){
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(4);
        lista.add(5);

        int retorno = this.calculoService.somar(lista);
        assertEquals(10, retorno);

    }
    
    
}
