package kingdom;

//Abstract class

public abstract class Animal {
  protected static int maxId = 0;
  protected int id;
  protected String name;
  protected int year;

  //Constructor
  public Animal (String name, int year) {
    maxId++;
    this.id = maxId;
    this.name = name;
    this.year = year;
  }

  //getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getYear() {
    return year;
  }

  //setters
  public void setName(String name) {
    this.name = name;
  }

  public void setYear(int year) {
    this.year = year;
  }

  //Other methods
  public void move() {
    System.out.println("Default");
  }

  public void breathe() {
    System.out.println("Default");
  }

  public void reproduce() {
    System.out.println("Default");
  }

  @Override
  public String toString() {
    return "Name: " + name + "\n" +
    "Year: " + year;
  }

}
