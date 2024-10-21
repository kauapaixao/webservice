package com.example.javaproject;
import java.util.*;

public class CarrosManager {
    private List<Carro> carros;

    public CarrosManager() {
        this.carros = new ArrayList<>();
        this.carros.add(new Carro("RS3", "AUDI"));
        this.carros.add(new Carro("Camaro", "Chevrolet"));
    }
    public List<Carro> getCarro() {
        return this.carros;
    }
}