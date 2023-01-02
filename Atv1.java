package Atividades;

import java.util.Scanner;

public class Atv1 {
	public static void main(String args[]) {
		int a;
		
		Scanner leia = new Scanner (System.in);
		System.out.println ("\nEntre com um número: ");
		a = leia.nextInt();

		if(a % 2 == 0 && a >= 0) {
			System.out.println ("\nO Número é par e positivo!!!");
		}
		else if(a % 2 == 0 && a < 0) {
			System.out.println ("\nO Número é par e negativo!!!");
		}
		else if(a % 2 == 1 && a >= 0) {
			System.out.println ("\nO Número é impar e positivo!!!");
		}
		else
			System.out.println ("\nO Número é impar e negativo!!!");			
	}
	
}
