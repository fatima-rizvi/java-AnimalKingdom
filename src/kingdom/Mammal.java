package kingdom;

import java.util.*;

public class Mammal extends Animal {

  public Mammal(String name, int year) {
    super("Mammal", name, year);
  }

  @Override
    public String move() {
      System.out.println("walk");
    }

  @Override
    public String breathe() {
      System.out.println("lungs");
    }

  @Override
    public String reproduce() {
      System.out.println("live births");
    }

}
