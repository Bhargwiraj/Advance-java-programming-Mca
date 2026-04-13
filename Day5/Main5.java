package Day5;
import java.util.*;
public class Main5 {
    public static void main(String[] args) {
        List <String> list = Arrays .asList("Java", "Stream", "API");
        list.stream().map(x->x.length()).forEach(System.out::println);
    }
}
