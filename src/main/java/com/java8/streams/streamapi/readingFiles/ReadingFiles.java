package com.java8.streams.streamapi.readingFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ReadingFiles {
    public void readFilesUsingStream() throws IOException {
        List<String> lists=Files.lines(Paths.get("D:/ALL PROJECTS/JAVA 8/pom.xml"))
                .filter(line -> line.contains("name"))
                .map(line -> {
                    String vallue=line.concat("Nelson");
                            return vallue;
                })
                .collect(Collectors.toList());

        System.out.println(lists);

    }
}
