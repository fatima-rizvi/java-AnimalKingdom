package kingdom;

import java.util.*;

public class Fish extends Animal {

  public Fish(String name, int year) {
    super("Fish", name, year);
  }

  @Override
    public String move() {
      System.out.println("swim");
    }

  @Override
    public String breathe() {
      System.out.println("gills");
    }

  @Override
    public String reproduce() {
      System.out.println("eggs");
    }

}
