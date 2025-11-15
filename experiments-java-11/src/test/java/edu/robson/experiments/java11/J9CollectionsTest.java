package edu.robson.experiments.java11;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class J9CollectionsTest {

    private final J9Collections tested = new J9Collections();

    @Test
    void listOf() {
        assertTrue(tested.listOf().containsAll(List.of("abc", "", "xyz")));
    }

    @Test
    void listOfNull() {
        assertThrows(NullPointerException.class, () -> tested.listOfNull());
    }

    @Test
    void mapOf() {
        assertTrue(tested.mapOf().containsValue("abc"));
        assertTrue(tested.mapOf().containsValue(""));
        assertTrue(tested.mapOf().containsValue("xyz"));
    }

    @Test
    void setOf() {
        assertTrue(tested.setOf().containsAll(List.of(7, 1, 2)));
    }

    @Test
    void setOfDuplicates() {
        assertThrows(IllegalArgumentException.class, () -> tested.setOfDuplicates());
    }

}