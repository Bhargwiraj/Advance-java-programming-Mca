//ind the length of each string in a list using map(). 
package Day19;
import java.util.*;
public class Main19 {
    public static void main(String[] args) {
                List<String> list = Arrays.asList("apple", "banana", "mango", "grapes");
 List<Integer> result =list.stream().map(x->x.length()).toList();
 System.out.println(result);
    }
}
