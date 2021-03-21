public class HelloWorld {
  int worldHeight;
  int worldWidth;
  public HelloWorld(int height, int width) {
    worldHeight = height;
    worldWidth = width;
  }
  public static void main(String[] args) {
    HelloWorld myWorld = new HelloWorld(5, 5);
    System.out.println(myWorld.worldHeight);
    System.out.println(myWorld.worldWidth);
  }
}
