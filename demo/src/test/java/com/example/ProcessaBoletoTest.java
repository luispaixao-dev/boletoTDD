package com.example;

import org.junit.Assert;
import org.junit.Test;

public class ProcessaBoletoTest {

    /**
     * teste para a clase Processa boleto
     */

    @Test
    public void criaPagametoTest(){
        Assert.assertTrue(ProcessaBoleto.criaPagamento());

    }

    
}
