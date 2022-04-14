package com.example;

import java.util.Date;

public class Boleto {

    private int codigo;
    private Date data;
    private float valor;

    public Boleto(int codigo, Date data, float valor) {
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
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    
}
