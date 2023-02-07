package Exercicio13;

import java.util.Scanner;

/*Faça um Programa que leia um número e exiba o dia correspondente da 
 semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve 
 aparecer valor inválido.*/

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x == 1) {
			System.out.println("DOMINGO");
		}
		else if (x == 2) {
			System.out.println("SEGUNDA");
		}
		else if (x == 3) {
			System.out.println("TERÇA");
		
		}
		else if (x == 4) {
			System.out.println("QUARTA");
		}
		else if (x == 5) {
			System.out.println("QUINTA");
		}
		else if (x == 6) {
			System.out.println("SEXTA");
		}
		else if (x == 7){
			System.out.println("SABADO");
		}
		else {
			System.out.println("Valor invalido");
		}
		sc.close();

	}

}
