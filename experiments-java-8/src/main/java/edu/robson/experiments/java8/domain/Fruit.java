package edu.robson.experiments.java8.domain;

import java.util.StringJoiner;

/**
 * Abstract fruit class.
 */
public abstract class Fruit
    implements Fruitable {

  protected Integer productNumber;
  protected String name = null;
  protected String colour = null;
  protected boolean sweet = false;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getColour() {
    return colour;
  }

  @Override
  public boolean isSweet() {
    return sweet;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public void setColour(final String colour) {
    this.colour = colour;
  }

  public void setSweet(final boolean sweet) {
    this.sweet = sweet;
  }

  public Integer getProductNumber() {
    return productNumber;
  }

  public void setProductNumber(Integer productNumber) {
    this.productNumber = productNumber;
  }

  @Override
  public String toString() {
    return "Fruit{" +
            "productNumber=" + productNumber +
            ", name='" + name + '\'' +
            ", colour='" + colour + '\'' +
            ", sweet=" + sweet +
            '}';
  }
}
