package atividade01;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);

        int num=0, anterior=0, proximo=0;

        System.out.println("Digite um número: ");
        num = ler.nextInt();
        anterior = num - 1;
        proximo = num + 1;
        ler.close();

        System.out.println("O número digitado foi: "+num);
        System.out.println("O número anterior é: "+anterior);
        System.out.println("O número posterior é: "+proximo); 
    }
}
