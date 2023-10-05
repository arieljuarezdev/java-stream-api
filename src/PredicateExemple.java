import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemple {
    public static void main(String[] args) {
        List <String> palavras = Arrays.asList("Java", "Kotlin", "python", "JavaScript", "C", "Go", "Ruby");
    
        Predicate <String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream().filter(palavra -> palavra.length() >5).forEach(p -> System.out.println(p));
    
    }
}
