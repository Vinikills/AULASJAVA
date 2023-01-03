package Atividades;
import java.util.Scanner;
public class While2 
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