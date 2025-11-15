package edu.robson.experiments.java8.domain;

/**
 * An interface for fruits.
 */
public interface Fruitable {

  static String defaultProvider() {
    return "Fresh Fruits Corporation";
  }

  default String getProvider() {
    return "Provided by " + defaultProvider();
  }

  String getName();

  String getColour();

  boolean isSweet();
}
