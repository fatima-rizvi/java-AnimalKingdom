package kingdom;

//Abstract class

public abstract class Animal {
  protected static int maxId = 0;
  protected int id;
  protected String type;
  protected String name;
  protected int year;

  //Constructor
  public Animal (String type, String name, int year) {
    maxId++;
    this.id = maxId;
    this.type = type;
    this.name = name;
    this.year = year;
  }

  //getters
  public int getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public int getYear() {
    return year;
  }

  //setters
  public void setType(String type) {
    this.type = type;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setYear(int year) {
    this.year = year;
  }

  //Other methods
  // public void move() {
  //   System.out.println("Default");
  // }
  //
  // public void breathe() {
  //   System.out.println("Default");
  // }
  //
  // public void reproduce() {
  //   System.out.println("Default");
  // }

  public String move() {
    return "default";
  }

  public String breathe() {
    return "default";
  }

  public String reproduce() {
    return "default";
  }

  // @Override
  // public String toString() {
  //   return "Name: " + name + "\n" +
  //   "Year: " + year;
  // }

  @Override
  public String toString() {
    return "Animals{id=" + id + ", name='" + name + "', yearNamed=" + year + "}";
  }

  public String toStringAnimal() {
    return getName() + " " + reproduce() + " " + move() + " " + breathe() + " " + getYear();
  }

}
