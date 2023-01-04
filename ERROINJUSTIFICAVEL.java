package Atividades;
import java.util.Scanner;
public class ERROINJUSTIFICAVEL {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String palavra1,palavra2,palavra3;
		
		System.out.println("\nEntre com a primeira palavra: ");
		palavra1 = new String (ler.next());
		System.out.println("\nEntre com a segunda palavra: ");
		palavra2 = new String (ler.next());
		System.out.println("\nEntre com a terceira palavra: ");
		palavra3 = new String (ler.next());
		

		System.out.println(palavra1.getClass());
		System.out.println("vertebrado".getClass());
		if(palavra1 == "vertebrado") 
		{
			if(palavra2 == "ave")
			{
				if(palavra3 == "carnivoro")
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