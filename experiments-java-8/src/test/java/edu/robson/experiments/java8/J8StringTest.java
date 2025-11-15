package edu.robson.experiments.java8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class J8StringTest {

  private final J8String tested = new J8String();

  @Test
  void testJoin() {
    final String[] strArray = {"a", "bc", "def"};
    assertEquals("abcdef", String.join("", strArray));
    assertEquals("a, bc, def", String.join(", ", Arrays.asList(strArray)));
  }

  @Test
  void testStringJoiner() {
    assertEquals("a, bc, def", tested.stringJoiner());
  }

  @Test
  void testStringJoinerPrefixSuffix() {
    assertEquals("<list>a, bc, def</list>", tested.stringJoinerPrefixSuffix());
  }
}
