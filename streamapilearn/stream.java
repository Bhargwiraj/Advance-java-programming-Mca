package streamapilearn;
import java.util.*;
public class stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,36,66,77,87,9);
        list.stream().filter(x->x%2==00).map(x->x+x).forEach(System.out::println);
    }
}
