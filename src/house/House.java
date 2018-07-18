package house;

import components.Door;
import components.Roof;
import components.Wall;
import components.Window;

public class House {
  private Door door;
  private Roof roof;
  private Wall wall;
  private Window window;

  public House(Door door, Roof roof, Wall wall, Window window) {
    this.door = door;
    this.roof = roof;
    this.wall = wall;
    this.window = window;
  }

  public Door getDoor() {
    return door;
  }

  public Roof getRoof() {
    return roof;
  }

  public Wall getWall() {
    return wall;
  }

  public Window getWindow() {
    return window;
  }
}
