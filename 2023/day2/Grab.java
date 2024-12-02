import java.util.ArrayList;

class Grab {
  ArrayList<Cube> cubes;

  public Grab(ArrayList<Cube> cubes) {
    this.cubes = cubes;
  }

  public Integer count(Cube.CubeColour colour) {
    Integer count = 0;
    for (Cube cube : this.cubes) {
      if (cube.colour == colour) {
        count++;
      }
    }
    return count;
  }

  public String toString() {
    return String.format("Grab: red: %d, green: %d, blue: %d", this.count(Cube.CubeColour.RED), this.count(Cube.CubeColour.GREEN), this.count(Cube.CubeColour.BLUE));
  }
}