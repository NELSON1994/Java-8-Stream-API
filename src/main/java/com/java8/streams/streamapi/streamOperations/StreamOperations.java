package com.java8.streams.streamapi.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    //TERMINAL OPERATIONS
    public void forEach1(){
    //    Stream<Integer> stream2 = list.stream();
        Stream<Integer> vals=Stream.of(1,2,3,4,5,6,7,8,9,10);
        vals.forEach(e -> System.out.println(e));
      //  vals.forEach(System.out :: println);
    }
    public void collect1(){
        //    Stream<Integer> stream2 = list.stream();
        Stream<Integer> vals=Stream.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> lv=vals.collect(Collectors.toList());
        System.out.println(lv);

    }

    public void match(){
        //    Stream<Integer> stream2 = list.stream();
        Stream<Integer> vals=Stream.of(1,2,3,4,5,6,7,8,9,10);
        boolean res=vals.anyMatch(e -> e == 9);
       // boolean res2=vals.allMatch(e -> e >30);
        System.out.println(res);
      //  System.out.println(res2);
    }


    public void count1(){
        //    Stream<Integer> stream2 = list.stream();
        Stream<Integer> vals=Stream.of(1,2,3,4,5,6,7,8,9,10);
        long res=vals.filter(e -> e >6).count();
        System.out.println(res);
    }

    public void reduce1(){
        //    Stream<Integer> stream2 = list.stream();
        Stream<Integer> vals=Stream.of(1,2,3,4,5,6,7,8,9,10);
        Stream<String> vals1=Stream.of("e eee","gtyttt","hggffff");
        Optional<Integer> res=vals.reduce((e1,e2) -> e1 +e2);
        Optional<String> res1=vals1.reduce((e1,e2) -> e1.concat("#").concat(e2));// eeeee # gtytttt#hggfff
        System.out.println(res);
    }

    public void findFirst(){
        //    Stream<Integer> stream2 = list.stream();
        Stream<Integer> vals=Stream.of(1,2,3,4,5,6,7,8,9,10);
        int res=vals.filter(e -> e > 7).findFirst().get();
        System.out.println(res);
    }

    public void sort(){
        //    Stream<Integer> stream2 = list.stream();
        Stream<Integer> vals=Stream.of(30,89,1,2,3,4,45,5,6,7,8,9,10);
        List<Integer> lv=vals.sorted().collect(Collectors.toList());
        System.out.println(lv);

    }

    public void map(){
        //    Stream<Integer> stream2 = list.stream();
        Stream<Integer> vals=Stream.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> lv=vals
                .map(e -> e * 4)
                .collect(Collectors.toList());
        System.out.println(lv);

    }

    //Stream.flatMap() helps in converting Stream<Collection<T>> to Stream<T>.
    //Before flattening   : [[1, 2, 3], [4, 5], [6, 7, 8]]
    //After flattening    : [1, 2, 3, 4, 5, 6, 7, 8]
    public void flatmap(){
        //    Stream<Integer> stream2 = list.stream();

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
        List<Integer> listOfAllIntegers = listOfLists.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println(listOfAllIntegers);
        //[1, 2, 3, 4, 5, 6, 7, 8, 9]

    }

    // other methods
    // max(),min,noneMatch,forEachOrdered,findAny,sorted,distinct,limit,skip,map,flatmap

}
