package Exercicio21;

import java.util.Scanner;

public class Main {
         //duvida
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int saque; 
		int x = 1, y = 5 , z = 10, a = 50, b = 100;
		saque = sc.nextInt();
		
		if (saque >= 10 && saque <= 600) {
		    b = (saque / 100);
		    saque = saque - (b*100);
				    
		    a = (saque/50);
			saque = saque - (a*50);

			z = (saque/10);
		    saque = saque - (z*10);

		    y = (saque/5);
		    saque = saque - (y*5);

		    x = saque;
				    
		    System.out.printf(b + " Notas de R$100,00 /");
		    System.out.printf(a + " Notas de R$ 50,00 /");
		    System.out.printf(z + " Notas de R$ 10,00 /");
		    System.out.printf(y + " Notas de R$  5,00 /");
		    System.out.printf(x + " Notas de R$  1,00 /");
		}
		
		
		sc.close(); 

	}

}
