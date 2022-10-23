package atividade03;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        for (int contador = 0; contador < 5; contador++){
          System.out.println("Digite uma palavra: ");
          String palavra1 = ler.nextLine();

          if (palavra1.contentEquals("Java-2022")) {
            System.out.println("Palavra OK"); 
            break;
          } else
            System.out.println("Palavra Errada! Tente Novamente");
        }
        
        ler.close();
    }
}
