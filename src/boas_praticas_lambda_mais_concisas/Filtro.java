package boas_praticas_lambda_mais_concisas;

@FunctionalInterface
public interface Filtro<T> {

    boolean avaliar(T objeto);

}