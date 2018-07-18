import builders.BuilderHouse;
import house.House;

public class App {

  public static void main(String[] args) {
    Director director = new Director();
    BuilderHouse builder = new BuilderHouse();

    director.constructWoodHouse(builder);
    House woodHouse = builder.getResult();
    System.out.println(woodHouse.getDoor().getColor());

    director.constructPlasticHouse(builder);
    House plasticHouse = builder.getResult();
    System.out.println(plasticHouse.getWall().getMaterial());
  }

}


