package Exercicio15;

import java.util.Scanner;

/*Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa 
dever� informar se os valores podem ser um tri�ngulo. Indique, caso os 
lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno.
Dicas:
.Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for 
maior que o terceiro;
.Tri�ngulo Equil�tero: tr�s lados iguais;
.Tri�ngulo Is�sceles: quaisquer dois lados iguais;
.Tri�ngulo Escaleno: tr�s lados diferentes;
*/

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y, z;
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		
		
		if (x + y < z || z + y < x || z + x < y) {
			System.out.println("N�o � um tri�ngulo");
		}
		else if (x == y && x == z) {
			System.out.println("Triangulo equil�tero");
		}
		else if (x == y || x == z || z == y) {
			System.out.println("Triangulo Is�sceles");
		}
		else {
			System.out.println("Tri�ngulo Escaleno");
		}
		
		
		sc.close();

	}

}
