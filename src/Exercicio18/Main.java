package Exercicio18;

import java.util.Scanner;

/*Faça um Programa que peça uma data no formato dd/mm/aaaa e determine 
se a mesma é uma data válida.*/

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int dia, mes, ano;
		dia = sc.nextInt();
		mes = sc.nextInt();
		ano = sc.nextInt();
		
		if (dia <= 31 && mes <= 12 && ano >= 0) {
			System.out.println(dia +"/"+ mes +"/"+ ano);
			System.out.println("Data válida");
		}
		else {
			System.out.println("Data invalida");
		}
		
		
		sc.close();

	}

}
