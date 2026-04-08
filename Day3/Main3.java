 import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(10, 20, 30);

        List<String> result = list.stream()
                                 .map(num -> String.valueOf(num))
                                 .collect(Collectors.toList());

        System.out.println(result);
    }
}
