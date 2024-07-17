package Predicate_removendo_elementos_colecao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		var produtos = new ArrayList<Produto>();
		produtos.add(new Produto("Sabão", new BigDecimal("9.9"), 11));
		produtos.add(new Produto("Leite", new BigDecimal("3.4"), 22));
		produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
		produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
		produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
		produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));

		/* Metodo Antigo para poder Remover um Produto */
		
//		Iterator<Produto> produtosIterator = produtos.iterator();
//		while (produtosIterator.hasNext()) { /* hasNext () determina se há mais elementos a serem iterados */
//			Produto produto = produtosIterator.next();
//			if (produto.getQuantidade() < 1) {
//				produtosIterator.remove(); /* vai remover produtos sen Estoque */
//			}
//		}

		/* Metodo mais Moderno para poder Remover um Produto usando Expressões Lambda */
		
		/* removeIf - recebe um Predicate, ou seja uma expressão Lambda*/	
		produtos.removeIf(produto -> produto.getQuantidade() < 1); // removeIf - esse metodo siguinifica 'removaSe'

//		Predicate<Produto> predicateSemEstoque = produto -> produto.getQuantidade() < 1;
//		Predicate<Produto> predicateInativo = produto -> Produto.Status.INATIVO.equals(produto.getStatus()); /* A PARTE ESQUERDA VAI VERIFICAR SE ESTA INATIVO*/

//		produtos.removeIf(predicateSemEstoque.or(predicateInativo)); /* .or 'Ou'*/
//		produtos.removeIf(predicateSemEstoque.negate()); /* Vai remover os Produtos que TEM estoque atraves do metodo '.Negate()'*/
//		produtos.removeIf(Predicate.not(produto -> produto.getQuantidade() < 1));
//		produtos.removeIf(produto -> produto.getQuantidade() > 0); /* Vai pegar os todos os produtos que tem Estoque */

		for (Produto produto : produtos) { /* Vai percorrer na lista de 'produtos' */
			System.out.println(produto);
		}
	}
	
}