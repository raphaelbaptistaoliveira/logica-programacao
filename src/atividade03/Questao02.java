package atividade03;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        System.out.println("Escreva uma mensagem: ");
        String mem = ler.nextLine();

        System.out.println("Digite um numero: ");
        int n1 = ler.nextInt();
        
        for(int i=0; i<n1; i++){
            System.out.println(mem); 
        } 
        
        ler.close();
    }
}
