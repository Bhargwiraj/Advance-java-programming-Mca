//Write a Java program to filter odd numbers from a list of integers. 
package Day13;
import java.util.*;
public class Main13 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,3,44,65,77,99,9,05);
        List<Integer> result=list.stream().filter( x-> x%2 != 0).toList();
        System.out.println(result);
    }
}
