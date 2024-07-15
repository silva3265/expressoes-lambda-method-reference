package usando_FunctionalInterface;

@FunctionalInterface /* Essa Anotação indica que essa interface 'Filtro', tem como ser usada como Interface Funcional */
public interface Filtro<T> {

    boolean avaliar(T objeto); // somente poder ter apenas 1 metodo abstrato

}