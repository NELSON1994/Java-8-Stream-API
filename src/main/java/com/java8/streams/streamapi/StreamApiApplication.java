package com.java8.streams.streamapi;

import com.java8.streams.streamapi.javaStreams.CreateStreams;
import com.java8.streams.streamapi.javaStreams.StreamCollectors;
import com.java8.streams.streamapi.peekandskip.PeekandSkip;
import com.java8.streams.streamapi.readingFiles.ReadingFiles;
import com.java8.streams.streamapi.streamOperations.StreamOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

//@SpringBootApplication
public class StreamApiApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(StreamApiApplication.class, args);
//    }

    public static void main(String[] args) {
        PeekandSkip peekandSkip=new PeekandSkip();
        System.out.println("================>>>  PEEK AND SKIP");
        peekandSkip.useOfPeekAndSkip();

        ReadingFiles readingFiles=new ReadingFiles();
        System.out.println("================>>>  READING FILES");
        try {
            readingFiles.readFilesUsingStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        CreateStreams createStreams=new CreateStreams();
        createStreams.createStreams();

        StreamCollectors streamCollectors=new StreamCollectors();
        streamCollectors.collectors();
        streamCollectors.collectToArray();

        StreamOperations streamOperations=new StreamOperations();
        System.out.println("================>>>  COLLECT()");
        streamOperations.collect1();
        System.out.println("================>>>  COUNT()");
        streamOperations.count1();
        System.out.println("================>>>  FINDFIRST()");
        streamOperations.findFirst();
        System.out.println("================>>>  FLATMAP()");
        streamOperations.flatmap();
        System.out.println("================>>>  FOREACH()");
        streamOperations.forEach1();
        System.out.println("================>>>  MAP()");
        streamOperations.map();
        System.out.println("================>>>  MATCH()");
        streamOperations.match();
        System.out.println("================>>>  REDUCE()");
        streamOperations.reduce1();
        System.out.println("================>>>  SORT()");
        streamOperations.sort();
    }

}
