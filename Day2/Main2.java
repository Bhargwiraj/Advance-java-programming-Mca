package Day2;
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        List<String>list=Arrays.asList("Java", "Python", "C" );
        list.stream().map(str->str.charAt(0)).forEach(System.out::println);
    }
}