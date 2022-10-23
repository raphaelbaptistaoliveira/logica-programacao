package atividade03;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1,n2;
        System.out.println("Digite o primeiro numero: ");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextInt();
        
        do{
            n1++;
            System.out.println("Os números entre eles são: "+n1);
        } while (n1 < (n2-1));

        ler.close();
    }
}
