package com.example;

import org.junit.Assert;
import org.junit.Test;

public class PagamentoTest {
    /**
     * testes da classe pagamento
     */
    @Test
    public void processa_pagamento() {
        Assert.assertTrue(Pagamento.processaPagamento());;
        
    }


    
}
