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

    public static Pagamento criaPagamento(int i, String string, String string2) {
        Pagamento p = new Pagamento(500, "13/04/22", "Boleto");

        return  true;
        
    }

    


    
}
