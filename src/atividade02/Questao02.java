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

        if (num1 <= num2){
            if (num1 >= num3){
                System.out.println(num1+"O maior número digitado foi: " +num2+ " e o menor número digitado foi: "+num3);
            }
            
        }
         
        ler.close();
    }
    
}
