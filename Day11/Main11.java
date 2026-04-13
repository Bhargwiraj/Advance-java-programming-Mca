// Write a Java program to filter all strings that end with the letter 'A' from a list of 
//strings.
package Day11;
import java.util.*;
public class Main11 {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Aman","ritu","Shaina","Dikasha");
        List<String> result=list.stream().filter(x->x.endsWith("a")).toList();
System.out.println(result);
    }
}
