package kingdom;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    //Start list
    List<Animal> animalList = new ArrayList<>();

    //Mammal(String name, int year)
    animalList.add(new Mammal("Panda", 1869));
    animalList.add(new Mammal("Zebra", 1778));
    animalList.add(new Mammal("Koala", 1816));
    animalList.add(new Mammal("Sloth", 1804));
    animalList.add(new Mammal("Armadillo", 1758));
    animalList.add(new Mammal("Raccoon", 1758));
    animalList.add(new Mammal("Bigfoot", 2021));

    //Bird(String name, int year)
    animalList.add(new Bird("Pigeon", 1837));
    animalList.add(new Bird("Peacock", 1821));
    animalList.add(new Bird("Toucan", 1758));
    animalList.add(new Bird("Parrot", 1824));
    animalList.add(new Bird("Swan", 1758));

    //Fish(String name, int year)
    animalList.add(new Fish("Salmon", 1758));
    animalList.add(new Fish("Catfish", 1817));
    animalList.add(new Fish("Perch", 1758));

    //Print all animals
    //animalList.forEach((a) -> System.out.println(a));

    //List all animals in descending order by year named
    // System.out.println("Descending order by year named: ");
    // animalList.sort((a1, a2) -> (a1.getYear() < a2.getYear()) ? 1 : -1);
    // animalList.forEach((a) -> System.out.println(a));
    // System.out.println();
    //System.out.println(animalList);

    //List all animals alphabetically
    // System.out.println("Alphabetically: ");
    // animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    // animalList.forEach((a) -> System.out.println(a));
    // System.out.println();

    //List all animals by how they move
    // System.out.println("List all animals by how they move: ");
    // animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
    // animalList.forEach((a) -> System.out.println(a));
    // System.out.println();

    //List only animals who breathe with their lungs
    // System.out.println("Animals that breathe with lungs: ");
    // printFilteredList(animalList, (a) -> a.breathe() == "lungs");

    //List only animals that breathe with their lungs and were named in 1758
    // System.out.println("Animals that breathe with lungs and were named in 1758: ");
    // printFilteredList(animalList, (a) -> a.breathe() == "lungs" && a.getYear() == 1758);

    //List only animals that lay eggs and breathe with their lungs
    // System.out.println("Animals that lay eggs and breathe with their lungs: ");
    // printFilteredList(animalList, (a) -> a.breathe() == "lungs" && a.reproduce() == "eggs");

    //List alphabetically only animals that were named in 1758
    //They're already alphabetical from earlier test, but i'll redo it.
    System.out.println("List alphabetically animals that were named in 1758: ");
    animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    printFilteredList(animalList, (a) -> a.getYear() == 1758);

  }

  //Filter method
  public static void printFilteredList(List<Animal> animalList, AnimalTester animalTester){
    //things that can hold the parent (fish) can hold the child (koi)
    for (Animal a : animalList) {
      if (animalTester.test(a)) {
        System.out.println(a.toStringAnimal());
      }
      //System.out.println();
    }
  }

}
