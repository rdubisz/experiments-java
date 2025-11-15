package edu.robson.experiments.java11;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class J9Collections {

    public List<String> listOf() {
        return List.of("abc", "xyz", "");
    }

    public Map<Integer, String> mapOf() {
        return Map.of(1, "abc", 2, "xyz", -1, "");
    }

    public Set<Integer> setOf() {
        return Set.of(1, 2, 9, 8, 7);
    }

    public Set<Integer> setOfDuplicates() {
        return Set.of(1, 2, 9, 8, 7, 2);
    }

    /**
     * Null is not allowed.
     */
    public List<String> listOfNull() {
        return List.of("abc", "xyz", "", null);
    }

}
