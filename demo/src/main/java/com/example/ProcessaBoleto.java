package com.example;


public class ProcessaBoleto {
    private Fatura fatura;
    private Boleto[] boletos;

    public ProcessaBoleto(Fatura fatura, Boleto[] boletos) {
        this.fatura = fatura;
        this.setBoletos(boletos);
    }
    
    public Boleto[] getBoletos() {
        return boletos;
    }

    public void setBoletos(Boleto[] boletos) {
        this.boletos = boletos;
    }

    public Fatura getFatura() {
        return fatura;
    }
    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public static Pagamento processaPagamento ( Boleto b) {
        Pagamento p = new Pagamento(15, "12/12", "boleto");
        return p;
        
    }
    public static String pagarFatura(Fatura fatura, Boleto[] boletos) {
        return "pago";
        
    }

    


    


    
}
