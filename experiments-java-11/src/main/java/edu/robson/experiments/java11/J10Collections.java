package edu.robson.experiments.java11;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class J10Collections {

    public List<String> copyOfSet() {
        Set<String> set = Set.of("abc", "xyz", "");
        return List.copyOf(set);
    }

    public Set<String> copyOfList() {
        List<String> list = List.of("abc", "xyz", "");
        return Set.copyOf(list);
    }

    public List<String> toUnmodifiable() {
        Stream<String> stream1 = Stream.of("abc", "xyz", "");
        List<String> mList = stream1.collect(Collectors.toList());
        mList.add("a");

        Stream<String> stream2 = Stream.of("abc", "xyz", "");
        List<String> umList = stream2.collect(Collectors.toUnmodifiableList());
        umList.add("b");
        return umList;
    }

}
