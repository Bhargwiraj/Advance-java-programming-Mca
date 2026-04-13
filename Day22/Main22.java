// Given a list of integers, convert each number into its square. 
package Day22;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 public class Main22 {
    public static void main(String[] args) {
                List<Integer> list = Arrays.asList(2, 3, 4, 5);

         List<Integer> result = list.stream()
                                  .map(x -> x * x)
                                  .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(result);

    }
}
