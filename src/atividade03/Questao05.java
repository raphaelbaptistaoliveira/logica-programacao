package atividade03;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = ler.nextInt();
        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = ler.nextInt();
        System.out.println("Digite a idade da terceira pessoa: ");
        int idade3 = ler.nextInt();
        System.out.println("Digite a idade da quarta pessoa: ");
        int idade4 = ler.nextInt();
        System.out.println("Digite a idade da quinta pessoa: ");
        int idade5 = ler.nextInt();

        int a = 0;
        for (int i=1; i<=5; i++);
        if (idade1+idade2+idade3+idade4+idade5 >= 18) {
            System.out.println("A quantidade de pessoas que são maiores ou que tem 18 anos são: "+a);
        }else if (idade1+idade2+idade3+idade4+idade5 < 18) {
            System.out.println("A quantidade de pessoas que são menores que 18 anos são:"+a);
        } 
        ler.close();
    }
}
