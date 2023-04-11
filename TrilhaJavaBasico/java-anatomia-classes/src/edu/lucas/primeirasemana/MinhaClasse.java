package edu.lucas.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "ArthasEx";
        String segundoNome = ":)";

        String bumbum = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(bumbum);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}