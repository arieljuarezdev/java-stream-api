import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {
    protected static final int Integer = 0;

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7 ,8 ,10);

        Consumer<Integer> imprimirNumerosPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);; 
            
    }
}
