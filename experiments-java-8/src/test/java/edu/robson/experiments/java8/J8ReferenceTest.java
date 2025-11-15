package edu.robson.experiments.java8;

import edu.robson.experiments.java8.domain.Fruitable;
import edu.robson.experiments.java8.domain.Pear;
import edu.robson.experiments.java8.domain.Strawberry;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for method reference.
 */
public class J8ReferenceTest {

    public static final String PRODUCER_HAPPY_STRAWBERRY = "HappyStrawberry";

    public static boolean containsHappyStrawberry(final Fruitable fruitable) {
        return fruitable.getProvider().contains(PRODUCER_HAPPY_STRAWBERRY);
    }

    @Test
    void testMethodReferenceInstance() {
        final List<Fruitable> list = List.of(new Strawberry(), new Pear(), new Strawberry());
        final boolean containsHsInstanceMethod = list.stream().anyMatch(f -> f.getProvider().contains(PRODUCER_HAPPY_STRAWBERRY));
        assertTrue(containsHsInstanceMethod);
    }

    @Test
    void testMethodReferenceStatic() {
        final List<Fruitable> list = List.of(new Strawberry(), new Pear(), new Strawberry());
        final boolean containsHsStaticMethod = list.stream().anyMatch(J8ReferenceTest::containsHappyStrawberry);
        assertTrue(containsHsStaticMethod);
    }
}
