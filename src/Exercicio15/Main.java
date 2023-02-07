package Exercicio15;

import java.util.Scanner;

/*Faça um Programa que peça os 3 lados de um triângulo. O programa 
deverá informar se os valores podem ser um triângulo. Indique, caso os 
lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
Dicas:
.Três lados formam um triângulo quando a soma de quaisquer dois lados for 
maior que o terceiro;
.Triângulo Equilátero: três lados iguais;
.Triângulo Isósceles: quaisquer dois lados iguais;
.Triângulo Escaleno: três lados diferentes;
*/

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y, z;
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		
		
		if (x + y < z || z + y < x || z + x < y) {
			System.out.println("Não é um triângulo");
		}
		else if (x == y && x == z) {
			System.out.println("Triangulo equilátero");
		}
		else if (x == y || x == z || z == y) {
			System.out.println("Triangulo Isósceles");
		}
		else {
			System.out.println("Triângulo Escaleno");
		}
		
		
		sc.close();

	}

}
