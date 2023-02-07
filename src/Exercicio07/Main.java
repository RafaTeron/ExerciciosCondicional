package Exercicio07;

import java.util.Scanner;

/*Faça um Programa que leia três números e mostre o maior 
e o menor deles.*/

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, z, maior = 0, menor = 0;
		x = (int) sc.nextDouble();
		y = (int) sc.nextDouble();
		z = (int) sc.nextDouble();		
				
		if (x > y && x > z && z > y) {
			maior = x;
			menor = y;
		}
		else if (x < y && z < y && x > z) {
			maior = y;
			menor = z;
		}
		else if (z > x && z > y && y > x) {
			maior = z;
			menor = x;
		}
		else if (x > y && x > z && z < y) {
			maior = x;
			menor = z;
		}
		else if (x < y && z < y && x < z) {
			maior = y;
			menor = x;
		}
		else {
			maior = z;
			menor = y;
		}
		System.out.println("Maior " + maior);
		System.out.println("Menor " + menor);
		sc.close();

	}

}
