package Atividades;

import java.util.Scanner;

public class Atv2 {

	public static void main(String[] args) {
		int lanche,quantidade;
		float total,op=0;
		Scanner leia = new Scanner(System.in);
		System.out.println ("Escolha uma opção do menu");
		System.out.println ("\n1 - Cachorro-Quente: 10,00$");
		System.out.println ("\n2 - X-Salada: 15,00$");
		System.out.println ("\n3 - X-Bacon: 18,00$");
		System.out.println ("\n4 - Bauru: 12,00$");
		System.out.println ("\n5 - Refrigerante: 8,00$");
		System.out.println ("\n6 - Suco de laranja: 13,00$");
		
		System.out.println ("\nQual é sua opção: ");
		lanche = leia.nextInt();
		switch(lanche) {
		case 1:
			op = 10;
			break;
		case 2:
			op = 15;
			break;
		case 3:
			op = 18;
			break;
		case 4:
			op = 12;
			break;
		case 5:
			op = 8;
			break;
		case 6:
			op = 13;
			break;
			default:
				System.out.println ("\n			Digite uma opção válida!");
		}
		if (lanche>=1 && lanche<7)
		{
		System.out.println ("\nQuantos você quer?");
		quantidade = leia.nextInt();
		
		total = op * quantidade;
		System.out.printf ("\nO total foi de: R$%.2f",total); 
		}
	}

}
