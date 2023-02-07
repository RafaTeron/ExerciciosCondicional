package Exercicio04;

import java.util.Scanner;

/*Faça um Programa que verifique se uma letra digitada 
 é vogal ou consoante.*/

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String answer = sc.nextLine();
		
		if (answer.equals("A")) {
			System.out.println("Vogal");
		}
		else if (answer.equals("E")) {
			System.out.println("Vogal");
		}
		else if (answer.equals("I")) {
			System.out.println("Vogal");
		}
		else if (answer.equals("O")) {
			System.out.println("Vogal");
		}
		else if (answer.equals("U")) {
			System.out.println("Vogal");
		}
		else {
			System.out.println("Consoante");
		}
		
		sc.close();

	}

}
