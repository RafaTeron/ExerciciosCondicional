package Exercicio10;

import java.util.Scanner;

/*Faça um Programa que pergunte em que turno você estuda. Peça para 
digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem 
"Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Em que turno você estuda ?");
		
		String answer = sc.nextLine();
		
		if (answer.equals("M")) {
			System.out.println("Bom dia!");
		}
		else if (answer.equals("V")) {
			System.out.println("Boa tarde!");
		}
		else if (answer.equals("N")) {
			System.out.println("Boa Noite!");
		}
		else {
			System.out.println("Valor Inválido");
		}
		
		sc.close();

	}

}
