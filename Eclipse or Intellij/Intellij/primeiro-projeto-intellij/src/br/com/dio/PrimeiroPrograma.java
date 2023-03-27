package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        Livro livro = new Livro("Rangers Ordem dos Arqueiros",300);
        System.out.println(gato);
        System.out.println(livro);

        // Ctrl D duplica a linha
//        System.out.println("Hello World!");
//        System.out.println("De lei");
    }

}

class Livro {

    private String nomeLivro;
    private Integer numPag;

    @Override
    public String toString() {
        return "Livro{" +
                "nomeLivro='" + nomeLivro + '\'' +
                ", numPag=" + numPag +
                '}';
    }
    public String getNomeLivro() {
        return nomeLivro;
    }
    public Integer getNumPag() {
        return numPag;
    }
    public Livro(String nomeLivro, Integer numPag) {
        this.nomeLivro = nomeLivro;
        this.numPag = numPag;
    }
}







