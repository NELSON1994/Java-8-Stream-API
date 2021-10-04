package com.java8.streams.streamapi.javaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {
    public void createStreams(){
        //Stream.of()
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(e -> System.out.println(e));

        //Stream.of(array)
        Stream<Integer> stream1 = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream1.forEach(p -> System.out.println(p));

        //List.stream()
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream2 = list.stream();
        stream2.forEach(p -> System.out.println(p));

    }
}
