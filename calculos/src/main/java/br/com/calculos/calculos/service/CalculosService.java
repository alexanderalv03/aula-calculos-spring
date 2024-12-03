package br.com.calculos.calculos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.calculos.calculos.entity.Entrada;
import br.com.calculos.calculos.entity.Resultado;

@Service

public class CalculosService {
    
    public Resultado calcular(Entrada entrada){
        Resultado resultado = new Resultado();
        Integer soma=0;


        if(entrada.getLista() != null)
            for(int i=0; i<entrada.getLista().size(); i++ ) {
                soma += entrada.getLista().get(i);

            }
            resultado.setSoma(soma);
            Double media =(double) (soma/entrada.getLista().size());
            resultado.setMedia(media);
            return resultado;
        
    }

    public int somar(List<Integer> lista) {
        int soma = 0;

        for (int i = 0; i<lista.size(); i++){
            
            soma += lista.get(i);
        }

        return soma;
        
    }



}
