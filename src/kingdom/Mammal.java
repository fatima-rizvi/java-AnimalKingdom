package kingdom;

import java.util.*;

public class Mammal extends Animal {

  public Mammal(String name, int year) {
    super("Mammal", name, year);
  }

  @Override
    public void move() {
      System.out.println("walk");
    }

  @Override
    public void breathe() {
      System.out.println("lungs");
    }

  @Override
    public void reproduce() {
      System.out.println("live births");
    }

}
