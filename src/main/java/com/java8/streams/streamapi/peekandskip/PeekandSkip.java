package com.java8.streams.streamapi.peekandskip;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class PeekandSkip {
    public void useOfPeekAndSkip(){
        Stream<String> stringStream=Stream.of("One","Two","Three","Four");
      //  Long a= stringStream.count();
     //   System.out.println(a);
    //    stringStream.filter(obj -> !obj.equals("Four")).forEach(e -> System.out.println(e));
//
        List<String> list=stringStream
                .filter(obj -> !obj.equals("Four"))
                .peek(obj -> System.out.println("Peeked Item : " +obj))// log in all filtered values
                .collect(Collectors.toList());
        System.out.println(list);

        IntStream vals=IntStream.of(1,2,3,4,5,6,7,8,9,10 ,7,1,4);
            vals.skip(2) // skip the first 2 values before doing filter
                .filter(e -> e > 2)
                .forEach(e -> System.out.println(e));
    }
}
