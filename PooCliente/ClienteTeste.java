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
