package Exercicio19;

import java.util.Scanner;

/*Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade
de centenas, dezenas e unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16*/

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, centenas, dezenas, unidades;
		numero = sc.nextInt();
		
		if (numero < 1000) {
		  unidades = numero % 10;
		  centenas = numero - unidades;
		  centenas = centenas / 10;
		  dezenas = centenas % 10;
		  centenas = centenas - dezenas;
		  centenas = centenas / 10;
		  System.out.print(centenas + " centenas, " + dezenas + " dezenas e " + unidades + " unidades");
				  
		}
		
		sc.close();

	}
}
	
