// Add 10 to each element of a list using map () 
package Day18;
import java.util.*;
public class Main18 {
    public static void main(String[] args) {
         List <Integer> list=Arrays.asList(12,3,33,5,7,8);
         List<Integer> result=list.stream().map(x->x+10).toList();
         System.out.println(result);
    }
}
