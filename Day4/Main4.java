package Day4;
import java.util.*;
public class Main4 {
    public static void main(String[] args) {
        List <String> list=Arrays.asList("A", "B", "C");
list.stream().map(x->"Item-"+x).forEach( System.out::println);
    }
}
