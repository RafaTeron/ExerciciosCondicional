package Exercicio06;

import java.util.Scanner;

/*Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.*/

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y, z;
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		
		if (x > y && x > z) {
		   System.out.println(x);
		}
		else if (y > x && y > z) {
			System.out.println(y);
		}
		else {
			System.out.println(z);
		}
		
		sc.close();

	}

}
