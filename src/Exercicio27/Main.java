package Exercicio27;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double morango = sc.nextDouble();
		double maca = sc.nextDouble();

		double soma = 0, kg, desconto, totalmo, totalma;
		double mo1 = 2.20, mo2 = 2.50;
		double ma1 = 1.50, ma2 = 1.80;

		if (morango <= 5 && maca <= 5) {
			kg = morango + maca;
			totalmo = morango * mo2;
			totalma = maca * ma2;
			soma = totalmo + totalma;

			if (kg > 8 || soma >= 25) {
				desconto = soma * 0.1;
				soma = soma - desconto;
				System.out.printf("Valor total R$ %.2f%n", soma);
			} else {
				System.out.printf("Valor total R$ %.2f%n", soma);
			}			
		}
		if (morango > 5 && maca <= 5) {
			kg = morango + maca;
			totalmo = morango * mo1;
			totalma = maca * ma2;
			soma = totalmo + totalma;
			
			if (kg > 8 || soma >= 25) {
				desconto = soma * 0.1;
				soma = soma - desconto;
				System.out.printf("Valor total R$ %.2f%n", soma);
			} else {
				System.out.printf("Valor total R$ %.2f%n", soma);
			}
		}
		if (morango <= 5 && maca > 5) {
			kg = morango + maca;
			totalmo = morango * mo2;
			totalma = maca * ma1;
			soma = totalmo + totalma;
			
			if (kg > 8 || soma >= 25) {
				desconto = soma * 0.1;
				soma = soma - desconto;
				System.out.printf("Valor total R$ %.2f%n", soma);
			} else {
				System.out.printf("Valor total R$ %.2f%n", soma);
			}
		}
		if (morango >= 6 && maca >= 6) {
			kg = morango + maca;
			totalmo = morango * mo1;
			totalma = maca * ma1;
			soma = totalmo + totalma;
			
			if (kg > 8 || soma >= 25) {
				desconto = soma * 0.1;
				soma = soma - desconto;
				System.out.printf("Valor total R$ %.2f%n", soma);
			} else {
				System.out.printf("Valor total R$ %.2f%n", soma);
			}
		}
		
		
		sc.close();

	}

}
