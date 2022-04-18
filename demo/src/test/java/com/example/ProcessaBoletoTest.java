package com.example;

import org.junit.Assert;
import org.junit.Test;

public class ProcessaBoletoTest {

    /**
     * teste para a clase Processa boleto
     */

    @Test
    public void processa_pagamentoTest(){
        Boleto b = new Boleto(11, "12/12/12", 150);
        final Pagamento expected = new Pagamento(11, "12/12/12", "Boleto");
    }
    
        
        
        
    }
}
