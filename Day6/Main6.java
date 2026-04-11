package Day6
 import java.util.*;
public class Main6 {
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(5,6,7);
        List<Integer> result=list.stream().map(x->x+x).toList();
        System.out.println(result);
    }
}
