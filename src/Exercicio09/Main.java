package Exercicio09;

import java.util.Scanner;

/*Faça um Programa que leia três números e mostre-os em ordem decrescente.*/

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y, z;
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		
		if (x >= y && x >= z && y >= z) {
			System.out.println("Ordem : " + x + "> " + y + "> " + z);
		}
		else if (x >= y && x >= z && z >= y) {
			System.out.println("Ordem : " + x + "> " + z + "> " + y);
		}
		else if (y >= x && y >= z && x >= z) {
			System.out.println("Ordem : " + y + "> " + x + "> " + z);
		}
		else if (y >= x && y >= z && z >= x) {
			System.out.println("Ordem : " + y + "> " + z + "> " + x);
		}
		else if (z >= x && z >= y && x >= y) {
			System.out.println("Ordem : " + z + "> " + x + "> " + y);
		}
		else {
			System.out.println("Ordem : " + z + "> " + y + "> " + x);
		}
		
		sc.close();

	}

}
