package atividade02;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a idade da pessoa: ");
        int idade = ler.nextInt();

        if (idade >= 18){
            System.out.println("A pessoa pode dirigir");
        }else {
            System.out.println("A pessoa não pode dirigir");
        }
        ler.close(); 
    }
}
