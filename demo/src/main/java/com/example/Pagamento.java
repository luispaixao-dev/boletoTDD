package com.example;


public class Pagamento {
    private float valorPago;
    private String Data;
    private String tipo;


    public Pagamento(float valorPago, String data, String tipo) {
        this.setValorPago(valorPago);
        this. setData (data);
        this.setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getData() {
        return Data;
    }


    public void setData(String data2) {
        this.Data = data2;
    }


    public float getValorPago() {
        return valorPago;
    }


    public void setValorPago(float valorPago2) {
        this.valorPago = valorPago2;
    }

    
}
