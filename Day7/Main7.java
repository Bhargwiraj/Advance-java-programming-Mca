package Day7;
import java .util.*;
public class Main7 {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("1", "2", "3" );
         List<Integer> result = list.stream().map( Integer::valueOf).toList();
         System.out.println(result);
    }
}
