package Exercicio23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		
		if (x % 1 == 0) {
			System.out.printf("decimal");
		}
		else {
			System.out.printf("inteiro");
		}
		
		sc.close();

	}

}
