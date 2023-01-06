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
