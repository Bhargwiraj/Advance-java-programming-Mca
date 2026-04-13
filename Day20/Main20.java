//Extract the first character from each string using map(). 
package Day20;
import java .util.*;
public class Main20 {
    public static void main(String[] args) {
         List<String> list = Arrays.asList("apple", "banana", "mango", "grapes");
 List<Character> result =list.stream().map(x->x.charAt(0)).toList();
 System.out.println(result);
    }
}
