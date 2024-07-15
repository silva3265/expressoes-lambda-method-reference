package implementando_compataror_lambda;

@FunctionalInterface
public interface Filtro<T> {

    boolean avaliar(T objeto);

}