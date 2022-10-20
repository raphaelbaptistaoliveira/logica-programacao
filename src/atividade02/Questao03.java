package atividade02;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a idade da pessoa: ");
        int idade = ler.nextInt();

        if (idade >= 16){
            System.out.println("A pessoa pode votar");
        }else {
            System.out.println("A pessoa não pode Votar");
        }
        ler.close(); 
    }
}
