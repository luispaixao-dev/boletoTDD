package com.example;


public class Boleto {

    private int codigo;
    private String data;
    private float valor;

    public Boleto(int codigo, String data, float valor) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
    }
    public int getCodigo() {
        return codigo;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    
}
