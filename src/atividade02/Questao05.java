package atividade02;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a idade da pessoa: ");
        int idade = ler.nextInt();

        if (idade >= 18){
            System.out.println("A pessoa pode dirigir e pode votar!");
        }else if (idade < 16) {
            System.out.println("A pessoa não pode votar e nem dirigir!");
        } else {
            System.out.println("A pessoa pode votar mais não pode dirigir!");
        }
        ler.close();
    }
}
