package atividade03;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtMaior = 0;
        int qtMenor = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite a idade");
            int idade = ler.nextInt();
            if (idade >= 18) {
                // qtMaior = qtMaior + 1;
                qtMaior++;
            } else {
                qtMenor++;
            }
        }
        System.out.println(qtMaior + " pessoas são maiores de idade");
        System.out.println(qtMenor + " pessoas são menores de idade");
        ler.close();
    }
}
