package kingdom;

import java.util.*;

public class Mammal extends Animal {

  public Mammal(String name, int year) {
    super("Mammal", name, year);
  }

  @Override
    public String move() {
      return "walk";
    }

  @Override
    public String breathe() {
      return "lungs";
    }

  @Override
    public String reproduce() {
      return "live births";
    }

}
