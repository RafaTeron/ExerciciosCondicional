package Exercicio05;

import java.util.Scanner;

/*Fa�a um programa para a leitura de duas notas parciais de um aluno. O
  programa deve calcular a m�dia alcan�ada por aluno e apresentar:
A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
A mensagem "Reprovado", se a m�dia for menor do que sete;
A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.*/

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2;
		double media;
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		media = (nota1 + nota2) / 2;
		
		if(media == 10 ) {			
			System.out.println("Aprovado com Distin��o");
		}
		else if (media < 6 ) {
			System.out.println("Reprovado");
		}
		else {
			System.out.println("Aprovado");
		}
		sc.close();

	}

}
