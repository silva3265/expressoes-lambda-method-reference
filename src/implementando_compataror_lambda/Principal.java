package implementando_compataror_lambda;

import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		var cadastroCliente = new CadastroCliente();
		cadastroCliente.adicionar(new Cliente("João", 30));
		cadastroCliente.adicionar(new Cliente("Maria", 90));
		cadastroCliente.adicionar(new Cliente("Sebastião", 50));
		cadastroCliente.adicionar(new Cliente("Joaquina", 45));
		cadastroCliente.adicionar(new Cliente("Josefina", 25));

		List<Cliente> clientes = cadastroCliente.getClientes();

		/* Parte da esquerda da expressão Lambda são os 'argumentos', e na parte direita vamos colocar o que vai executar */
		clientes.sort((cliente1, cliente2) -> Integer.compare(cliente1.getIdade(), cliente2.getIdade())); // vai comprar cliente 1 com cliente 2 (parte da direita)

		for (Cliente cliente : clientes) {
			System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
		}
	}

}