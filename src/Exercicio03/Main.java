package Exercicio03;

/*Faça um Programa que verifique se uma letra digitada 
é "F" ou "M". Conforme a letra escrever: F - Feminino, 
M - Masculino, Sexo Inválido.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();
		
						
		if (answer.equals("F")) {
			System.out.println("Feminino");
		}
		else if (answer.equals("M")) {
			System.out.println("MACULINO");
		}
		else {
			System.out.println("Sexo invalido");
		}
		
		sc.close();

	}

}
