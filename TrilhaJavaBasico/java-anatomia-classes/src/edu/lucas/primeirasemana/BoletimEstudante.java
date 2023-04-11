package edu.lucas.primeirasemana;

import java.util.Scanner;

public class BoletimEstudante {
    public static void main(String[] args) {
        int mediaFinal = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do Aluno: ");
        mediaFinal = sc.nextInt();

        if (mediaFinal < 6) {
            System.out.println("Reprovado");
        } else if (mediaFinal == 6) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }
    }

}
