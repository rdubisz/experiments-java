package edu.robson.experiments.java8;

import java.util.StringJoiner;

public class J8String {

    public String stringJoinerPrefixSuffix() {
        final StringJoiner sj = new StringJoiner(", ", "<list>", "</list>");
        sj.add("a");
        sj.add("bc");
        sj.add("def");
        return sj.toString();
    }

    public String stringJoiner() {
        final StringJoiner sj = new StringJoiner(", ");
        sj.add("a");
        sj.add("bc");
        sj.add("def");
        return sj.toString();
    }
}
