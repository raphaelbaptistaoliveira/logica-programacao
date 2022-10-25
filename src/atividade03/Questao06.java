package atividade03;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1,n2,n3,n4,n5,soma,resto;
        double media;
        System.out.println("Digite o primeiro numero: ");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextInt();
        System.out.println("Digite o terceiro numero: ");
        n3 = ler.nextInt();
        System.out.println("Digite o quarto numero: ");
        n4 = ler.nextInt();
        System.out.println("Digite o quinto numero: ");
        n5 = ler.nextInt();
    
        int maior = 0;
        if (n1 >= n2 && n1 >= n3 && n1 >= n4 && n1 >= n5) {
            maior = n1;
        } else if (n2 >= n1 && n2 >= n3 && n1 >= n4 && n1 >= n5) {
            maior = n2;
        } else if (n3 >= n1 && n3 >= n2 && n3 >= n4 && n3 >= n5) {
            maior = n3;
        } else if (n4 >= n1 && n4 >= n2 && n4 >= n3 && n4 >= n5) {
            maior = n4;
        } else if (n5 >= n1 && n5 >= n2 && n5 >= n3 && n5 >= n4) {
            maior = n5;
        }
    
        int menor = 0;
        if (n1 <= n2 && n1 <= n3 && n1 <= n4 && n1 <= n5) {
            menor = n1;
        } else if (n2 <= n1 && n2 <= n3 && n1 <= n4 && n1 <= n5) {
            menor = n2;
        } else if (n3 <= n1 && n3 <= n2 && n3 <= n4 && n3 <= n5) {
            menor = n3;
        } else if (n4 <= n1 && n4 <= n2 && n4 <= n3 && n4 <= n5) {
            menor = n4;
        } else if (n5 <= n1 && n5 <= n2 && n5 <= n3 && n5 <= n4) {
            menor = n5;
        }
        System.out.println("O número maior e o: " + maior + " e o menor e: "+menor);
        
        soma = (n1+n2+n3+n4+n5);
        System.out.println("A soma dos números digitados e: " +soma);

        media = soma /5;
        System.out.println("A média dos números digitados e: " +media);

        resto = soma % 5;
        System.out.println("O resto e: " +resto); //calculo do módulo de resto da operação

        ler.close();
    }
}
