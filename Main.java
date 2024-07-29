import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Consumer<String> printConsumer = name -> System.out.println(name);
        names.forEach(printConsumer);

        //names.forEach(name -> System.out.println(name));
    }
}
