//Write a Java program to filter numbers greater than 50 from a list of integers and store 
//them in a new list. 
package Day8;
import java.util.*;
public class Main8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,225,32,453,758,90);
        List<Integer> result=list.stream().filter(x->x>50).toList();
        System.out.println(result);
    }
}
