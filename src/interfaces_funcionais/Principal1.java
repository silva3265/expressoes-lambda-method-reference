package interfaces_funcionais;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Principal1 {

    public static void main(String[] args) {
        Predicate<String> predicate = str -> str.startsWith("T"); /* Predicate - função de afirmação/teste recebe um tipo parametrizado, nesse Caso uma String */
        boolean comecaComT = predicate.test("Thiago"); // verifica se começa com 't'
        System.out.println(comecaComT);

        Function<String, LocalDate> function = str -> LocalDate.parse(str); /* Function - uma função de recebe um Objeto e retorna um objeto diferente */
        LocalDate data = function.apply("2023-09-13");
        System.out.println(data);

        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now(); /* Supplier - vai executar alguma coisa e retornar algo */
        LocalDateTime dataHora = supplier.get();
        System.out.println(dataHora);

        Consumer<String> consumer = str -> System.out.println(str); /* esse consumer nao vai retornar nada */
        consumer.accept("Olá, mergulhador");
    }

}
