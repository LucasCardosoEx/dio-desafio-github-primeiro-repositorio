package edu.sistemaSmartTV;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("Ligando TV...");
        System.out.println("LG - Life is Good");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Desligando...");
    }

    public void subirCanal() {
        canal++;
        System.out.println("Canal Atual: " + canal);
    }

    public void descerCanal() {
        canal--;
        System.out.println("Canal Atual: " + canal);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume para " + volume);

    }
}