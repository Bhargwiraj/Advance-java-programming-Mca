//Write a Java program to filter positive numbers from a list of integers. 
package Day12;
import java.util.*;
public class Main12 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,-3,-4,-77,78,88);
        List<Integer> printpostiveno = list.stream().filter(x->x>0).toList();
        System.out.println(printpostiveno);
    }
}
