package components;

abstract public class HouseObject {

  private Color color;
  private Material material;
  private int width;
  private int height;

  HouseObject(Color color, Material material, int width, int height) {
    this.color = color;
    this.material = material;
    this.width = width;
    this.height = height;
  }

  public Color getColor() {
    return color;
  }

  public Material getMaterial() {
    return material;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public enum Color {
    RED, GREEN, BLACK, BLUE, YELLOW, BROWN, WHITE
  }

  public enum Material {
    WOOD, STONE, CONCRETE, PLASTIC, GLASS
  }
}