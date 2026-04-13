//8) Write a Java program to filter all strings containing ‘A’   from a list of strings. 

package Day14;
import java.util.*;
public class Main14 {
   public static void main(String[] args) {
    List<String> list =Arrays.asList("Aman","Anakit","Sita","Seema","Pinky");
    List<String> result=list.stream().filter(x->x.contains("a")).toList();
    System.out.println(result);
   } 
}
