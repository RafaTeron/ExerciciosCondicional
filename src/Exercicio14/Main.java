package Exercicio14;

import java.util.Scanner;

/*Faça um programa que lê as duas notas parciais obtidas por um aluno 
numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição 
de conceitos obedece à tabela abaixo:
  Média de Aproveitamento  Conceito
  Entre 9.0 e 10.0        A
  Entre 7.5 e 9.0         B
  Entre 6.0 e 7.5         C
  Entre 4.0 e 6.0         D
  Entre 4.0 e zero        E
O algoritmo deve mostrar na tela as notas, a média, o conceito 
correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” 
se o conceito for D ou E.*/

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y, media;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		media = (x + y) / 2;
		System.out.println(media);
		
		if (media >= 9 && media <= 10) {
			System.out.println("A");
			System.out.printf("APROVADO");
		}
		else if (media >= 7.5 && media <= 9) {
			System.out.println("B");
			System.out.println("APROVADO");
		}
		else if (media >= 6 && media <= 7.5) {
			System.out.println("C");
			System.out.println("APROVADO");
		}
		else if (media >= 4 && media <= 6) {
			System.out.println("D");
			System.out.println("REPROVADO");
		}
		else if (media >= 0 && media <= 4) {
			System.out.println("E");
			System.out.println("REPROVADO");
		}
		sc.close();

	}

}
