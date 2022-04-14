package com.example;

import java.util.Date;

public class Fatura  {
    private Date Data;
    private float valorTotal;
    private String Cliente;

    public Fatura(Date data, float valorTotal, String cliente) {
        Data = data;
        this.valorTotal = valorTotal;
        Cliente = cliente;
    }

    public Date getData() {
        return Data;
    }
    public String getCliente() {
        return Cliente;
    }
    public void setCliente(String cliente) {
        this.Cliente = cliente;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public void setData(Date data) {
        this.Data = data;
    }
    
}
