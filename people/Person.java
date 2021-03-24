package people;

public class Person {
  public int age;
  int height;
  int weight;
  String role;
  public Person(int x, int y, int z, String providedRole) {
    age = x;
    height = y;
    weight = z;
    role = providedRole;
  }

  public void eat() {
    System.out.println("Time to eat! Nom nom.");
  }

  public void printRole() {
    System.out.println(role);
  }
}
