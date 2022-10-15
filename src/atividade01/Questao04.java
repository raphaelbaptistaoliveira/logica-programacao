package atividade01;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        String nome = ler.nextLine();
        System.out.println("Informe o valor da hora: ");
        float valorHora = ler.nextFloat();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        int qtHoras = ler.nextInt();
        float salario = (valorHora * qtHoras);
        System.out.println(nome+" vai receber R$ "+salario+" reais");
        ler.close(); 
    }
}
