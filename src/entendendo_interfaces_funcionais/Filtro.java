package entendendo_interfaces_funcionais;

public interface Filtro<T> {

    boolean avaliar(T objeto); /* pra ser uma interface funcional tem que ter apenas um unico metodo abstrato dentro dela  */

}