package atividade01;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor do jantar: ");
        float valorJantar = ler.nextFloat();
        
        float taxaGarcom = (valorJantar * 10)/100;
        System.out.println("A taxa de garçom é R$ "+taxaGarcom+ " reais");

        System.out.println("O valor da refeição é R$ "+valorJantar+" reais");

        float valorTotal = (valorJantar + taxaGarcom);
        System.out.println("O valor total é R$ "+valorTotal+ " reais"); 

        ler.close();
    }
}
