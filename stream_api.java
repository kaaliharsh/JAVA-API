import java.util.Arrays;
import java.util.*;
import java.util.stream.*;
public class stream_api {
    public static void main(String[] args) {

        List<Integer> ls=Arrays.asList(9,8,1,5);
        
        Stream<Integer> streamData=ls.stream();        //when you want to immutate the collection data or
        streamData.forEach(n->System.out.println(n));   //   not harm the collection data then stream api is used...
        
        //sorted the  Stream

        Stream<Integer> sr=streamData.sorted();
        sr.forEach(n->System.out.println(n));

    }
}
