package atividade01;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float nota1,nota2,media;
        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = ler.nextFloat();
        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = ler.nextFloat();

        media = (nota1 + nota2) /2;

        if (media >= 7){
            System.out.println("O aluno foi Aprovado");
        }else if (media < 7){
            System.out.println("O aluno foi Reprovado");
        }
            
        ler.close();
        System.out.println("Primeira nota: "+nota1);
        System.out.println("Segunda nota: "+nota2);
        System.out.println("A média final do aluno e: "+media);
    }
}
