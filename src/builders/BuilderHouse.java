package builders;

import components.Door;
import components.Roof;
import components.Wall;
import components.Window;
import house.House;

public class BuilderHouse implements Builder {

  private Wall wall;
  private Window window;
  private Door door;
  private Roof roof;

  @Override
  public void setWall(Wall wall) {
    this.wall = wall;
  }

  @Override
  public void setWindow(Window window) {
    this.window = window;
  }

  @Override
  public void setDoor(Door door) {
    this.door = door;
  }

  @Override
  public void setRoof(Roof roof) {
    this.roof = roof;
  }

  public House getResult() {
    return new House(door, roof, wall, window);
  }
}
