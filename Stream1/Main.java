package Stream1;

 import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<String> list=Arrays.asList ("sachin", "rahul", "amit");
          List<String> result=list.stream().map(x->x.toUpperCase()).toList();
          System.out.println(result);
    }
}