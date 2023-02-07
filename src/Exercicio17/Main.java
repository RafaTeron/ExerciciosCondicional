package Exercicio17;

import java.util.Scanner;

/*Faça um Programa que peça um número correspondente a um determinado 
ano e em seguida informe se este ano é ou não bissexto.*/

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ano = sc.nextInt();
		
		if (ano % 4 == 0 && ano % 100 !=0) {
			System.out.println("bissexto");
		}
		else if  (ano % 400 ==0) {
			System.out.println("bissexto");
		}
		else {
			System.out.println("Nao é bissexto");
		}
		
		sc.close();

	}

}
