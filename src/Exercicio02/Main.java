package Exercicio02;

import java.util.Scanner;

//Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.

public class Main {

	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      int A;
      A = sc.nextInt();
      
      if (A >= 0) {
    	  System.out.println("POSITIVO");
      }
      else {
    	  System.out.println("NEGATIVO");
      }
      
      
      sc.close();

	}

}
