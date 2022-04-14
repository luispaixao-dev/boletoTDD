package com.example;

import org.junit.Assert;
import org.junit.Test;

public class ProcessaBoletoTest {

    /**
     * teste para a clase Processa boleto
     */

    @Test
    public void criaPagametoRetornaPagamento(){
        final Pagamento expected = p;
        final Pagamento actual = ProcessaBoleto.criaPagamento(500, "13/04/22", "Boleto");
        Assert.assertEquals(expected, actual);
    }

    
}
