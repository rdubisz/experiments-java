package edu.robson.experiments.java8.lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class J8LambdaTest {

    private final J8Lambda tested = new J8Lambda();

    @Test
    void instanceNoSet() {
        assertFalse(tested.flag);
        tested.instanceNoSet();
        assertFalse(tested.flag);
    }

    @Test
    void instanceSet() {
        assertFalse(tested.flag);
        tested.instanceSet();
        assertTrue(tested.flag);
    }

    @Test
    void instanceSetNoCall() {
        assertFalse(tested.flag);
        tested.instanceSetNoCall();
        assertFalse(tested.flag);
    }

    @Test
    void instanceReturning() {
        assertFalse(tested.flag);
        tested.instanceReturning();
        assertFalse(tested.flag);
    }
}