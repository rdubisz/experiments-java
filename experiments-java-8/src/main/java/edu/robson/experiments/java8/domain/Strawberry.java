package edu.robson.experiments.java8.domain;

/**
 * Strawberry fruit class.
 */
public class Strawberry
    extends Fruit {

  public Strawberry() {
    this.name = "Strawberry";
    this.colour = "Red";
    this.sweet = true;
  }

  @Override
  public String getProvider() {
    return "Provided by HappyStrawberry Inc.";
  }
}
