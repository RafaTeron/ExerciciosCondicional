package Exercicio08;

import java.util.Scanner;

/*Fa�a um programa que pergunte o pre�o de tr�s produtos e informe 
qual produto voc� deve comprar, sabendo que a decis�o � sempre pelo mais barato.*/

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y, z;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		
		if (x < y && x < z) {
			System.out.println("Produto 1");
		}
		else if (y < x && y < z) {
			System.out.println("Produto 2");
		}
		else {
			System.out.println("Produto 3");
		}
		
		
		
		sc.close();

	}

}
