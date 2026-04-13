// Write a Java program to filter positive numbers greater than 20 from a list of integers. 
package Day9;
import java.util.*;
public class Main9 {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(-10,20,-4,77,8,-21,78);
        List<Integer> result = list.stream().filter(x->x>20).toList();
         System.out.println(result);
    }
}
