
import java.util.Arrays;
import java.util.List;

public class strem {
     public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50);
        List<Integer> result = list.stream().filter(x -> x % 2 == 0).toList();

        System.out.println(result);
}
}

