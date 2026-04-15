//16) Given a list of integers, convert each number into its square. 
package Day23;
import java .util.*;
public class Main23 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> result= list.stream().map(x->x*x).toList();
System.out.println(result);
    }
}
