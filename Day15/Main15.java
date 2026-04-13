//Write a Java program to filter all strings whose length is greater than 5 from a list of 
//strings. 
package Day15;
import java.util.*;
public class Main15 {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("Aman","Anakit","Sita","Seema","Pinky","Arunita");
    List<String> result=list.stream().filter(x->x.length()>5).toList();
    System.out.println(result);
    }
}
