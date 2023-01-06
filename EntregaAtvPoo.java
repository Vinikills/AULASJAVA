
public class EntregaAtvPoo {

}
package PooCliente;

public class Cliente {
	
	private String nome;
	private int idade;
	private String pais;
	private String cidade;
	private String bairro;
	
	
	public Cliente(String nome, int idade, String pais, String cidade, String bairro) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.pais = pais;
		this.cidade = cidade;
		this.bairro = bairro;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	public void mostrar() {
		System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nPaís: "+pais+"\nCidade: "+cidade+"\nBairro: "+bairro);
		
	
	}

}
package PooCliente;

public class ClienteTeste {

	public static void main (String [] args) {
		
		Cliente client = new Cliente("Vicente",1,"Brasil","São Paulo","Campo Limpo");
		client.mostrar();
		
		System.out.println("\nMudou de endereço!\n");
		
		client.setPais("EUA");
		client.setCidade("Orlando");
		client.setBairro("DisneyLand");
		client.mostrar();
	}
}
package PooRPG;

public class POORPG {

	private String nome;
	private String classe;
	private int forca;
	private int destreza;
	private int inteligencia;
	private int sorte;
	private int estamina;
	private int constituicao;
	
	public POORPG(String nome, String classe, int forca, int destreza, int inteligencia, int sorte, int estamina,
			int constituicao) {
		super();
		this.nome = nome;
		this.classe = classe;
		this.forca = forca;
		this.destreza = destreza;
		this.inteligencia = inteligencia;
		this.sorte = sorte;
		this.estamina = estamina;
		this.constituicao = constituicao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getDestreza() {
		return destreza;
	}
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getSorte() {
		return sorte;
	}
	public void setSorte(int sorte) {
		this.sorte = sorte;
	}
	public int getEstamina() {
		return estamina;
	}
	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}
	public int getConstituicao() {
		return constituicao;
	}
	public void setConstituicao(int constituicao) {
		this.constituicao = constituicao;
	}
	
	public void mostrar() {
		System.out.println("Nome: "+nome+"\nClasse: "+classe+"\n\t\t---Atributos---"+"\nForça: "+forca+"\nDestreza: "+destreza+"\nInteligência: "+inteligencia+"\nSorte: "+sorte+"\nEstamina: "+estamina+"\nConstituição: "+constituicao+"\n");
	}
	public void mostrar2() {
		System.out.println("\nVocê Morreu.");
	}
}
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
