package Exercicio10;

import java.util.Scanner;

/*Fa�a um Programa que pergunte em que turno voc� estuda. Pe�a para 
digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem 
"Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inv�lido!", conforme o caso.*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Em que turno voc� estuda ?");
		
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
			System.out.println("Valor Inv�lido");
		}
		
		sc.close();

	}

}
