package PooRPG;

import java.util.Scanner;

public class PooRPGTest {

	public static void main (String []args) {
		String oqueescreveu;
		Scanner leia = new Scanner (System.in);
		
		POORPG personagem = new POORPG("Zé","Guerreiro",10,10,10,10,10,10);
		POORPG personagem1 = new POORPG("Maria","Arqueiro",9,9,9,9,9,9);
		
		System.out.println("Coloque um nome no personagem: ");
		personagem1.setNome(leia.next());
		System.out.println("Coloque a sua classe: ");
		personagem1.setClasse(leia.next());
		

		personagem.mostrar();
		personagem1.mostrar();
		leia.nextLine();
		System.out.println("Escreva sua ação");
		oqueescreveu = leia.nextLine();
		System.out.println("Você morreu porque fez isso: "+oqueescreveu);
	}
	
	
}
