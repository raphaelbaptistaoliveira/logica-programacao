package atividade02;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1;
        System.out.println("Digite um numero: ");
        n1 = ler.nextInt();
        
        if (n1 < 0){
            System.out.println("Numero e menor que 0");
        }else if(n1 == 0){
            System.out.println("Numero e igual a 0");
        }else{
            System.out.println("Numero e maior que 0");
        }

        ler.close();
    }
}
