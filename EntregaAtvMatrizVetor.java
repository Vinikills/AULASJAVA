package Atividades;

public class EntregaAtvMatrizVetor {

}
package Atividades;

import java.util.Scanner;

public class MatrizAtv {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int matriz[][] = new int [3][3];
		int vetorDP [] = new int [3];
		int vetorDS [] = new int [3];
		int somaDP=0, somaDS=0, x, y;
		
		for (x=0;x<3;x++) {
			for (y=0;y<3;y++) {
				System.out.println("Insira um número: ");
				matriz [x][y] = leia.nextInt();
				if (x==y) {
					somaDP += matriz[x][y];
					vetorDP[x] = matriz [x][y];
				}
				if (x+y == 2) {
					somaDS += matriz[x][y];
					vetorDS[y] = matriz [x][y];						
					
				}
			}
		}
		System.out.println("Elementos da Diagonal Principal: ");
		for (x=0;x<3;x++) {
			System.out.println(vetorDP[x]);
		}
		System.out.println("Elementos da Diagonal Secundaria: ");
		for (x=0;x<3;x++) {
			System.out.println(vetorDS[x]);
		}
		System.out.println("Soma dos Elementos da Diagonal Principal: "+somaDP);
		System.out.println("Soma dos Elementos da Diagonal Secundaria: "+somaDS);
			
		
	}

}
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
