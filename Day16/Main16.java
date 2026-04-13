//Write a Java program to filter numbers divisible by 3 from a list of integers. 
package Day16;
import java.util.*;
public class Main16 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,33,4,59,9,7,27);
       List<Integer> result = list.stream().filter(x->x%3 == 0).toList();
       System.out.println(result);
    }
}
