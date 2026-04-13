// Write a Java program using map() to convert a list of lowercase strings into uppercase 
//strings
//
package Day17;
import java.util.*;
public class Main17 {
    public static void main(String[] args) {
        List <String> list=Arrays.asList("name","date","bhargwi","raj");
        List<String> result=list.stream().map(x->x.toUpperCase()).toList();
        System.out.println(result);
    }
}
