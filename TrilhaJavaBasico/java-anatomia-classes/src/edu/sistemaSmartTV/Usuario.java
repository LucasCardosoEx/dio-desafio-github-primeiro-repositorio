package edu.sistemaSmartTV;

public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println("Tv Ligada? " + smartTV.ligada);

        System.out.println("");
        smartTV.ligar();
        smartTV.subirCanal();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.subirCanal();
        smartTV.subirCanal();
        smartTV.subirCanal();
        smartTV.descerCanal();
    }
}
