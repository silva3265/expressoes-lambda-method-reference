package entendendo_interfaces_funcionais;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		var cadastroCliente = new CadastroCliente();
		cadastroCliente.adicionar(new Cliente("João", 30));
		cadastroCliente.adicionar(new Cliente("Maria", 90));
		cadastroCliente.adicionar(new Cliente("Sebastião", 50));
		cadastroCliente.adicionar(new Cliente("Joaquina", 45));
		cadastroCliente.adicionar(new Cliente("Josefina", 25));

		List<Cliente> clientes = cadastroCliente.consultar((Cliente cliente) -> {
			boolean resultado = cliente.getIdade() > 40;
			return resultado;
		});

		for (Cliente cliente : clientes) {
			System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
		}
	}

}