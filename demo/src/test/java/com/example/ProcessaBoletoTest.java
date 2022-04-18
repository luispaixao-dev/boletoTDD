package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class ProcessaBoletoTest {

    /**
     * teste para a clase Processa boleto
     */

    
    /**
     * inicialização das variavéis para o teste
     */
    Boleto[] arrayBoleto = {
        new Boleto(1,"12/12",50),
        new Boleto(2,"12/12",25),
        new Boleto(2,"12/12",100),
    };

    Fatura abril = new Fatura("12/12", 150, "luis");

    @Test
    public void processaPagamentoTest(){
      
        final Pagamento expected = new Pagamento(15, "12/12", "boleto");
        final Boleto b = new Boleto(1, "18/4/22", 15);

        Assert.assertEquals(expected.getValorPago(), ProcessaBoleto.processaPagamento(b).getValorPago()); 
        
        System.out.println(expected.getValorPago());   

    };

    @Test
    public void pagarFaturaTest() {
        final  String expected = "pago";
        Assert.assertEquals(expected, ProcessaBoleto.pagarFatura(abril, arrayBoleto));
        
    }
    
        
        
}
