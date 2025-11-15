package edu.robson.experiments.java8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;
import java.util.Optional;

import edu.robson.experiments.java8.domain.Fruit;
import edu.robson.experiments.java8.domain.Pear;
import edu.robson.experiments.java8.domain.Strawberry;
import org.junit.jupiter.api.Test;

/**
 * Test for {@link java.util.Optional}.
 */
public class J8OptionalTest {

  private Optional<Fruit> tested = Optional.empty();

  @Test
  void testOptionalGetEmpty() {
    assertThrows(NoSuchElementException.class, () -> tested.get());
    assertTrue(tested.isEmpty());
    assertFalse(tested.isPresent());
  }

  @Test
  void testOptionalOfClass() {
    tested = Optional.of(new Strawberry());
    assertTrue(tested.isPresent());
    assertEquals("Strawberry", tested.orElseThrow().getName());
  }

  @Test
  void testOptionalOfNull() {
    assertThrows(NullPointerException.class, () -> tested = Optional.of(null));
    assertTrue(tested.isEmpty());
  }

  @Test
  void testOptionalOfNullable() {
    tested = Optional.ofNullable(null);
    assertTrue(tested.isEmpty());
  }

  @Test
  void testOptionalOrElseGet() {
    final Fruit fruit = tested.orElseGet(Strawberry::new);
    assertEquals("Strawberry", fruit.getName());
  }

  @Test
  void testOptionalOrElse() {
    final Fruit fruit = tested.orElse(new Pear());
    assertFalse(tested.isPresent());
    assertEquals("Pear", fruit.getName());
  }

  @Test
  void testOptionalOrElseThrow() {
    assertThrows(IllegalArgumentException.class,
        () -> tested.orElseThrow(() -> new IllegalArgumentException("No value")));
  }

  @Test
  void testOptionalToStream() {
    assertEquals("Optional.empty", tested.toString());
    tested = Optional.of(new Strawberry());
    assertEquals("Optional[Fruit{productNumber=null, name='Strawberry', colour='Red', sweet=true}]", tested.toString());
  }
}
