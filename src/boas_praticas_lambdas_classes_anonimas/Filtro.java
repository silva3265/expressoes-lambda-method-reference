package boas_praticas_lambdas_classes_anonimas;

@FunctionalInterface
public interface Filtro<T> {

    boolean avaliar(T objeto);

}