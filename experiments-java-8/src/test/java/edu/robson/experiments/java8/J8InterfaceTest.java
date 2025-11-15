package edu.robson.experiments.java8;

import edu.robson.experiments.java8.domain.Fruit;
import edu.robson.experiments.java8.domain.Fruitable;
import edu.robson.experiments.java8.domain.Pear;
import edu.robson.experiments.java8.domain.Strawberry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for Interface static and default methods.
 */
public class J8InterfaceTest {

    private final Fruit strawberry = new Strawberry();
    private final Fruit pear = new Pear();

    @Test
    void testStaticMethod() {
        assertEquals("Fresh Fruits Corporation", Fruitable.defaultProvider());
    }

    @Test
    void testDefaultMethod() {
        assertEquals("Provided by Fresh Fruits Corporation", pear.getProvider());
        assertEquals("Provided by HappyStrawberry Inc.", strawberry.getProvider());
    }
}
