package Stream2;
 import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,2,4,5);
        list.stream().map(x->x*x).forEach(System.out::println);
    }
}

