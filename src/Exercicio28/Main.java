package Exercicio28;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome = "r";
		
		double soma = 0, total;
		double desconto = 0;
		double kg;

		int tipo = sc.nextInt();
		double quantidade = sc.nextDouble();
		

		if (tipo == 1) {				
			nome = "File Duplo";
			kg = 5.80;			
			soma = quantidade * kg;
			
		} 
		else if (tipo == 2) {
			nome = "Alcatra";
			kg = 6.80;
			soma = quantidade * kg;
			
		}
		else if (tipo == 3) {
			nome = "Picanha";
			kg = 7.80;
			soma = quantidade * kg;
			
		}
		
		System.out.println("####### Nota Fiscal #######");
		System.out.println("Nome ******************** " + nome);
		System.out.println("Quantidade ************** " + quantidade + " Kg");
		System.out.printf("Preço Total ************* R$ %.2f%n", soma);
		System.out.println("Dinheiro ****************");
		System.out.printf("Desconto **************** R$ %.2f%n", desconto);
		System.out.printf("Valor a pagar *********** R$ %.2f%n", soma);
		
		if (tipo == 11) {
			
			kg = 5.80;
			total = quantidade * kg;
			desconto = total * 0.05;
			soma = total - desconto;

			System.out.println("Nota Fiscal");
			System.out.println("File Duplo");
			System.out.println(quantidade + " Kg");
			System.out.printf("Preço Total R$ %.2f%n", total);
			System.out.println("Cartão Tabajara");
			System.out.printf("Desconto R$ %.2f%n", desconto);
			System.out.printf("Valor a pagar R$ %.2f%n", soma);
			
		}
		if (tipo == 12) {
			
			kg = 6.80;
			total = quantidade * kg;
			desconto = total * 0.05;
			soma = total - desconto;

			System.out.println("Nota Fiscal");
			System.out.println("Alcatra");
			System.out.println(quantidade + " Kg");
			System.out.printf("Preço Total R$ %.2f%n", total);
			System.out.println("Cartão Tabajara");
			System.out.printf("Desconto R$ %.2f%n", desconto);
			System.out.printf("Valor a pagar R$ %.2f%n", soma);
			
		}
		if (tipo == 13) {
			
			kg = 7.80;
		    total = quantidade * kg;
		    desconto = total * 0.05;
		    soma = total - desconto;
		    
		    System.out.println("Nota Fiscal");
			System.out.println("Picanha");
			System.out.println(quantidade + " Kg");
			System.out.printf("Preço Total R$ %.2f%n", total);
			System.out.println("Cartão Tabajara");
			System.out.printf("Desconto R$ %.2f%n", desconto);
			System.out.printf("Valor a pagar R$ %.2f%n", soma);
		}
		

		sc.close();
	}

}
