import builders.Builder;
import components.Door;
import components.HouseObject.Color;
import components.HouseObject.Material;
import components.Roof;
import components.Wall;
import components.Window;

class Director {

  void constructWoodHouse(Builder builder) {
    builder.setDoor(new Door(Color.BROWN, Material.WOOD, 20, 20));
    builder.setRoof(new Roof(Color.BROWN, Material.WOOD, 30, 30));
    builder.setWindow(new Window(Color.BROWN, Material.PLASTIC, 5, 5));
    builder.setWall(new Wall(Color.BROWN, Material.WOOD, 10, 5));
  }

  void constructPlasticHouse(Builder builder) {
    builder.setDoor(new Door(Color.RED, Material.PLASTIC, 20, 20));
    builder.setRoof(new Roof(Color.WHITE, Material.PLASTIC, 10, 30));
    builder.setWindow(new Window(Color.WHITE, Material.GLASS, 5, 5));
    builder.setWall(new Wall(Color.BLACK, Material.GLASS, 10, 5));
  }

}
