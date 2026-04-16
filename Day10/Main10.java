//Write a Java program to filter all strings that start with the letter 'A' from a list of 
//strings. 
package Day10;
import java.util.*;
public class Main10 {
    public static void main(String[] args) {
        List<String> list=  Arrays.asList("Aman","Mothi","Rahul","Amit");
        List<String> resultstring=list.stream().filter(x->x.startsWith("A")).toList();
        System.out.println(resultstring);
    }
}
