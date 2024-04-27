// streams/FileToWordsBuilder.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class FileToWordsBuilder {
    Stream.Builder<String> builder = Stream.builder();

    boolean build = false;

    public FileToWordsBuilder(String filePath) throws Exception {
        Files.lines(Paths.get(filePath))
                .skip(1) // Skip the comment line at the beginning
                .forEach(line -> {
                    for (String w : line.split("[ .?,]+"))
                        builder.add(w);
                });
    }

    void addStr(String str) {
        if (build) {
            throw new RuntimeException("already build");
        }
        for (String w : str.split("[ .?,]+"))
            builder.add(w);
    }

    Stream<String> stream() {
        build = true;
        return builder.build();
    }

    public static void
    main(String[] args) throws Exception {
        new FileToWordsBuilder("/Users/zss/Projects/OnJava8-Examples/streams/Cheese.dat").stream()
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::print);
        System.out.println("-------");
        FileToWordsBuilder fileToWordsBuilder = new FileToWordsBuilder("/Users/zss/Projects/OnJava8-Examples/streams/Cheese.dat");
        fileToWordsBuilder.addStr("hello java");
        fileToWordsBuilder.stream().forEach(System.out::println);

        fileToWordsBuilder.addStr("test already build add string");
    }
}
/* Output:
Not much of a cheese shop really
*/
