package interfaces_funcionais;

import java.util.function.*;

public class Principal2 {

    public static void main(String[] args) {
        IntPredicate predicate = num -> num > 10; /* IntPredicate - ele recebe como um argumento um int, nao precisa Fazer umboxing para converter para tipo classe */
        IntFunction<String> function = num -> "Número: " + num;
        IntSupplier supplier = () -> 10;
        IntConsumer consumer = num -> System.out.println("Número: " + num);
    }

}
