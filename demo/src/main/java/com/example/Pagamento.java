package com.example;

import java.sql.Date;

public class Pagamento {
    private int valorPago;
    private String Data;
    private String tipo;


    public Pagamento(int valorPago, String data, String tipo) {
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


    public int getValorPago() {
        return valorPago;
    }


    public void setValorPago(int valorPago) {
        this.valorPago = valorPago;
    }
    
}
