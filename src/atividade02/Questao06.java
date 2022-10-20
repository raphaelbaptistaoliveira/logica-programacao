package atividade02;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu peso no formato KG: ");
		double peso = entrada.nextDouble();
		System.out.println("Digite sua altura em Metros: ");
		double altura = entrada.nextDouble();
		
		double imc = (altura * altura) /peso;
		
		if (imc < 20) {
			System.out.printf("O IMC e: %.2f e seu peso é abaixo do Normal", imc);
		} else if (imc >= 20 && imc <= 25) {
			System.out.printf("O IMC e: %.2f e seu peso é Normal", imc);
		} else if (imc > 25 && imc <= 30) {
			System.out.printf("O IMC e: %.2f está com Sobrepeso", imc);
		} else if (imc > 30 && imc <= 35) {
			System.out.printf("O IMC e: %.2f está com Obesidade Leve", imc);
		} else if (imc > 35 && imc <= 40) {
			System.out.printf("O IMC e: %.2f está com Obesidade Moderada", imc);
		} else if (imc > 40) {
			System.out.printf("O IMC e: %.2f está com Obesidade Morbida", imc);
		}
    }
}
