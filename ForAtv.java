package Atividades;

import java.util.Scanner;

public class ForAtv
{
	public static void main(String[]args)
	{
		int numero1,numero2,x;
		Scanner leia = new Scanner(System.in);
		System.out.println ("Entre com o primeiro número: ");
		numero1 = leia.nextInt();
		System.out.println ("Entre com o segundo número: ");
		numero2 = leia.nextInt();
		
		if (numero1<numero2) {
			for (x = numero1;x <= numero2; x++) {
				if (x % 3 == 0 && x % 5 == 0) {
					System.out.println (x+" é um multiplo de 3 e 5");
				}
			}
		}
		else{
			System.out.println ("O Primeiro número deve ser menor que o segundo!!!");
		}
		
	}

}
