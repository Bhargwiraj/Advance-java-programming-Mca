//) From a list of integers, replace all negative numbers with 0 using map(). 
package Day21;
import java .util.*;
import java.util.stream.Collectors;
public class Main21 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-10, 5, -3, 20, -7, 15);
        List<Integer> result = list.stream()
                                  .map(x -> x < 0 ? 0 : x)
                                  .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(result);
    }
}
