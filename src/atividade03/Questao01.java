package atividade03;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        int num;
        System.out.println("...Tabuada...");
        System.out.println();
        System.out.println("Informar um número: ");
        num = ler.nextInt();
        
        for(int i=1; i<=10; i++){
            System.out.println("  "+num + " X " + i +" = "+(num*i)); 
        }
        ler.close();
    }
}
