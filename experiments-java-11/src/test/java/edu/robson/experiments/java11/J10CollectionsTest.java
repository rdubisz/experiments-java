package edu.robson.experiments.java11;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class J10CollectionsTest {

    private final J10Collections tested = new J10Collections();

    @Test
    void copyOfSet() {
        List<String> copied = tested.copyOfSet();
        assertThrows(UnsupportedOperationException.class, () -> copied.add("z"));
    }

    @Test
    void copyOfList() {
        Set<String> copied = tested.copyOfList();
        assertThrows(UnsupportedOperationException.class, () -> copied.add("z"));
    }

    @Test
    void toUnmodifiable() {
        assertThrows(UnsupportedOperationException.class, () -> tested.toUnmodifiable());
    }
}