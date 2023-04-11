package com.dio.oo.veiculos;

public class Carro extends Veiculo{
    String cor;
    String modelo;
    Double capacidadeTanque;

    Carro() {

    }

    public Carro(String cor, String modelo, Double capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeTanque=" + capacidadeTanque +
                '}';
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double totalValorTanque(Double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
