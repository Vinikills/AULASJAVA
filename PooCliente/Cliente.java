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
