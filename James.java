public class James {
  int jamesHeight;
  int jamesWidth;
  String jamesName;
  public James(String name, int height, int width) {
    jamesName = name;
    jamesHeight = height;
    jamesWidth = width;
  }
  public static void main(String[] args) {
    James james = new James("James", 5, 5);
    System.out.println("World Name: " + james.jamesName);
    System.out.println("World Size: " + james.jamesHeight + " x " + james.jamesWidth);
  }
}
