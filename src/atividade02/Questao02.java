package atividade02;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Digite o primeiro número inteiro: ");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        num2 = ler.nextInt();
        System.out.println("Digite o terceiro número inteiro: ");
        num3 = ler.nextInt();

        int maior;
        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
        } else if (num2 >= num3 && num2 >= num1) {
            maior = num2;
        } else {
            maior = num3;
        }
        int menor;
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
        } else if (num2 <= num3 && num2 <= num1) {
            menor = num2;
        } else {
            menor = num3;
        }
        System.out.println("O número maior e o:  " + maior);
        System.out.println("E o número menor e o: " + menor);
         
        ler.close();
    }
    
}
