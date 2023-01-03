package Atividades;
import java.util.Scanner;
public class ERROINJUSTIFICAVEL {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String palavra1,palavra2,palavra3;
		
		System.out.println("\nEntre com a primeira palavra: ");
		palavra1 = ler.next();
		System.out.println("\nEntre com a segunda palavra: ");
		palavra2 = ler.next();
		System.out.println("\nEntre com a terceira palavra: ");
		palavra3 = ler.next();
		
		
		if(palavra1.equalsIgnoreCase("vertebrado"))
		{
			if(palavra2.equalsIgnoreCase( "ave"))
			{
				if(palavra3.equalsIgnoreCase("carnivoro"))
				{
					System.out.println("\nÉ uma Águia");
				}
				else
				{
					System.out.println("\nÉ uma Pomba");
				}
			} 
			else 
			{
				if(palavra3 == "onivoro")
				{
					System.out.println("\nÉ um ser Humano");
				}
				else
				{
					System.out.println("\nÉ uma Vaca");
				}
			}
		}
		else 
		{
			if(palavra2 == "inseto")
			{
				if(palavra3 == "hematofago")
				{
					System.out.println("\nÉ uma Pulga");
				}
				else
				{
					System.out.println("\nÉ uma Lagarta");
				}
			}
			else
			{
				if(palavra3 == "hematofago")
				{
					System.out.println("\nÉ uma Sanguessuga");
				}
				else
				{
					System.out.println("\nÉ uma Minhoca");
				}
			}
		}	

	}

}