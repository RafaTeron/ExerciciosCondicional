package Exercicio20;

import java.util.Scanner;

/*Fa�a um Programa para leitura de tr�s notas parciais de um aluno. O programa 
deve calcular a m�dia alcan�ada por aluno e presentar:
A mensagem "Aprovado", se a m�dia for maior ou igual a 7, com a respectiva m�dia alcan�ada;
A mensagem "Reprovado", se a m�dia for menor do que 7, com a respectiva m�dia alcan�ada;
A mensagem "Aprovado com Distin��o", se a m�dia for igual a 10.*/

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y, z, media;
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		media = (x + y + z) / 3;
		
		if (media >= 7 && media < 10) {
			System.out.println("Aprovado");
		}
		else if (media < 7) {
			System.out.printf("Reprovado");
		}
		else if (media == 10) {
			System.out.println("Aprovado com Distin��o");
		}
				
		sc.close();

	}

}
