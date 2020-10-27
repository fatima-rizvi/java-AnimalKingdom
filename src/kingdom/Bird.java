package kingdom;

import java.util.*;

public class Bird extends Animal {

  public Bird(String name, int year) {
    super("Bird", name, year);
  }

  @Override
    public String move() {
      System.out.println("fly");
    }

  @Override
    public String breathe() {
      System.out.println("lungs");
    }

  @Override
    public String reproduce() {
      System.out.println("eggs");
    }

}
