package atividade01;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informar o valor da conta: ");
        double valorConta = ler.nextDouble();
        System.out.println("Por quantas pessoas vai dividir a conta?: ");
        int divisaoConta = ler.nextInt();
        double valorPessoa = (valorConta / divisaoConta);
        System.out.println("O valor que cada pessoa vai pagar é R$ "+valorPessoa+" reais");
        ler.close();
    }
}
