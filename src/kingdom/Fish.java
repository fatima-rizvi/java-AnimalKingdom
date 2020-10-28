package kingdom;

import java.util.*;

public class Fish extends Animal {

  public Fish(String name, int year) {
    super("Fish", name, year);
  }

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
