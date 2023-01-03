package Atividades;

import java.util.Scanner;

public class entregaatvloop {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int soma=0,numero;
		System.out.println("Digite um número: ");
		
		do 
			{
			numero = leia.nextInt();
				if (numero>0)
				{
					soma = numero + soma;
				}
			}
		while (numero!= 0);
		System.out.println("\nA soma dos números digitados foi: "+soma);

}
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
	{


		public static void main(String []args) 
		{
			int maior=0,menor=0,idade=0;
			Scanner leia = new Scanner(System.in);
			while (idade>=0)
			{
				System.out.println ("Entre com uma idade: ");
				idade = leia.nextInt();

				if (idade >= 50)
				{
					++maior;
				}
				if (idade <= 21 && idade >= 0)
				{
					++menor;
				}
				
			}
			System.out.println ("Quantidade de pessoas com menos de 21 anos são: "+ menor);
			System.out.println ("Quantidade de pessoas com mais de 50 anos são: "+ maior);
		
		}
	}