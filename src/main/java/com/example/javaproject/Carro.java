package com.example.javaproject;
public class Carro {
    private String marca;
    private String modelo;

    public Carro(){}
    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
}