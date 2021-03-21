public class HelloWorld {
  int worldHeight;
  int worldWidth;
  String worldName;
  public HelloWorld(String name, int height, int width) {
    worldName = name;
    worldHeight = height;
    worldWidth = width;
  }
  public static void main(String[] args) {
    HelloWorld myWorld = new HelloWorld("James's World", 5, 5);
    System.out.println("World Name: " + myWorld.worldName);
    System.out.println("World Size: " + myWorld.worldHeight + " x " + myWorld.worldWidth);
  }
}
