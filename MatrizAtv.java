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
