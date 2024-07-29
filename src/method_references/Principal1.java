package method_references;

import java.util.function.Consumer;
import java.util.function.ToIntFunction;

public class Principal1 {

	
	// method_references - referencia de metodos
	public static void main(String[] args) {
		ToIntFunction<Produto> function1 = produto -> produto.getQuantidade(); /* Vai pegar o produto e dar um getQuantidade*/
		Consumer<Produto> consumer1 = produto -> produto.inativar();

		/* Essa função faz a mesma coisa do que na função de cima só que melhorada */
		/* Esta ordenando Pela a quantidade */
		ToIntFunction<Produto> function2 = Produto::getQuantidade; /* :: - estamos obtendo uma referencia ao metodo*/
		Consumer<Produto> consumer2 = Produto::inativar; /* Vai incativar todos os produtos */
	}
	
}