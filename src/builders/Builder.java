package builders;

import components.Door;
import components.Roof;
import components.Wall;
import components.Window;

public interface Builder {

  void setWall(Wall wall);

  void setWindow(Window window);

  void setDoor(Door door);

  void setRoof(Roof roof);

}
