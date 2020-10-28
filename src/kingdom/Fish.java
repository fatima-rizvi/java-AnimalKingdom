package kingdom;

import java.util.*;

public class Fish extends Animal {

  public Fish(String name, int year) {
    super("Fish", name, year);
  }

  // @Override
  //   public void move() {
  //     System.out.println("swim");
  //   }
  //
  // @Override
  //   public void breathe() {
  //     System.out.println("gills");
  //   }
  //
  // @Override
  //   public void reproduce() {
  //     System.out.println("eggs");
  //   }

  @Override
    public String move() {
      return "swim";
    }

  @Override
    public String breathe() {
      return "gills";
    }

  @Override
    public String reproduce() {
      return "eggs";
    }

}
