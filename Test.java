import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        String word = "Indian";
        
        // Using Java 8 Stream API to count characters
        Map<Character, Long> characterCount = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        // Printing the count of every character
        characterCount.forEach((character, count) ->
                System.out.println("'" + character + "' occurs " + count + " times."));
    }
}
