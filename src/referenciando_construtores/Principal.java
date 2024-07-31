package referenciando_construtores;

import java.util.function.Function;

public class Principal {

	public static void main(String[] args) {
//		Function<String, Produto> function = nome -> new Produto(nome); /* nome que é uma String e Passamos o produto*/
		Function<String, Produto> function = Produto::new;
		Produto produto = function.apply("Arroz"); // vai retornar o tipo parametrizado 'R'

		System.out.println(produto);
	}
	
}