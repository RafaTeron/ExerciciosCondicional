package Exercicio01;

import java.util.Scanner;

//Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A > B) {
			System.out.println("" + A);
		}
		else {
			System.out.println("" + B);
		}
		
		sc.close();
	}

}
