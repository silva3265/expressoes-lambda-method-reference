package interface_funcional_consumer_iterando_forEach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Principal {

	public static void main(String[] args) {
		var produtos = new ArrayList<Produto>();
		produtos.add(new Produto("Sabão", new BigDecimal("9.9"), 11));
		produtos.add(new Produto("Leite", new BigDecimal("3.4"), 22));
		produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
		produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
		produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
		produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));

//		produtos.forEach(produto -> produto.setQuantidade(0)); /* vai zerar o estoque de todos os produtos */
//		produtos.forEach(produto -> System.out.println(produto)); /* vai fazer o loop e vai executar essa expressão para cada produto */

		Consumer<Produto> consumerZerarEstoque = produto -> produto.setQuantidade(0);
		Consumer<Produto> consumerImprimir = produto -> System.out.println(produto);

		produtos.forEach(consumerZerarEstoque.andThen(consumerImprimir)); /* andThen - esse metodo default da interface 'faça isso aqui e depois isso aqui'*/

		/* forEach - substitui o 'enrancedfor' */
		
//		for (Produto produto : produtos) {
//			System.out.println(produto);
//		}
	}
	
}