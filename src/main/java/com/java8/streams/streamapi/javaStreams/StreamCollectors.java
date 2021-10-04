package com.java8.streams.streamapi.javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectors {
    //.collect(Collectors.toList)
    public void collectors(){
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> vals=list.stream();
        List<Integer> even=vals
                .filter(e -> e%2 == 0)
                .peek(e -> System.out.println("peeked vals : " + e))
                .map(e -> {
                    return e * 4;
                        })
                .collect(Collectors.toList());
        System.out.println(even);
    }

    public void collectToArray(){
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> vals=list.stream();
        Integer[] arr=vals.filter(e -> e%2 == 0)
                .peek(e -> System.out.println("peeked vals : " + e))
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(arr));
    }
}
