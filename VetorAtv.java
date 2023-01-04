package Atividades;

import java.util.Scanner;

public class VetorAtv {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		float numero[] = {2,3,5,24,29,30,35,44,52,66};
		int x,achar, verificar=0;
		System.out.println("Insira um número: ");
		achar = leia.nextInt();
		
		for (x=0;x<10;x++){
			if (achar == numero[x]) {
				verificar = 1;
				System.out.println("O numero "+achar+" se encontra na posição "+x);
			}
			
		}
		if (verificar == 0) {
			System.out.println("O número: "+achar+" não foi encontrado!");	
		}
	}

}
