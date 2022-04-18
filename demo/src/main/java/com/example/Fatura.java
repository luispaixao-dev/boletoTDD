package com.example;


public class Fatura  {
    private String Data;
    private float valorTotal;
    private String Cliente;

    public Fatura(String data, float valorTotal, String cliente) {
        Data = data;
        this.valorTotal = valorTotal;
        Cliente = cliente;
    }

    public String getData() {
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
    public void setData(String data) {
        this.Data = data;
    }
    
}
