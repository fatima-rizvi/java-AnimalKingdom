package kingdom;

import java.util.*;

public class Bird extends Animal {

  public Bird(String name, int year) {
    super("Bird", name, year);
  }

  @Override
    public void move() {
      System.out.println("fly");
    }

  @Override
    public void breathe() {
      System.out.println("lungs");
    }

  @Override
    public void reproduce() {
      System.out.println("eggs");
    }

}
