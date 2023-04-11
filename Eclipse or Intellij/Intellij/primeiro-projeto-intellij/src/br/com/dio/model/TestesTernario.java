package br.com.dio.model;

import java.util.Scanner;

public class TestesTernario {
    public static void main(String[] args) {

        int num = 0;
        String resultNum;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Let s see: 0 = a, 1 = b type 000 to out: ");
            num = sc.nextInt();
            resultNum = (num == 0) ? "a = 0" : "b";
            System.out.println(resultNum);
        } while (num == 000);
    }
}
