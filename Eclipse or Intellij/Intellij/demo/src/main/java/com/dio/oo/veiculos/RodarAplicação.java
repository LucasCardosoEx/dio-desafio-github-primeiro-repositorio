package com.dio.oo.veiculos;

public class RodarAplicação {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Civic");
        carro1.setCapacidadeTanque(1000.0);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.99));

        System.out.println("Carro 2");

        Carro carro2 = new Carro("Branco", "Palio", 99.0 );

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.99));

    }
}
