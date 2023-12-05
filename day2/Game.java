import java.util.ArrayList;

class Game {
  
  Integer id;

  ArrayList<Grab> grabs;

  static Integer MAX_RED = 12;
  static Integer MAX_GREEN = 13;
  static Integer MAX_BLUE = 14;

  public Game(Integer id, ArrayList<Grab> grabs) {
    this.id = id;
    this.grabs = grabs;
    System.out.println("Creating game: " + this);
    if (!this.isValid()) {
      throw new IllegalArgumentException("Game " + this.id + " is invalid");
    }
  }

  public Game(Integer id, ArrayList<Grab> grabs, Boolean validate) {
    this.id = id;
    this.grabs = grabs;
    System.out.println("Creating game: " + this);
    if (validate && !this.isValid()) {
      throw new IllegalArgumentException("Game " + this.id + " is invalid");
    }
  }

  public Boolean isValid() {
    for (Grab grab : this.grabs) {
      if (grab.count(Cube.CubeColour.RED) > MAX_RED) {
        return false;
      }
      if (grab.count(Cube.CubeColour.GREEN) > MAX_GREEN) {
        return false;
      }
      if (grab.count(Cube.CubeColour.BLUE) > MAX_BLUE) {
        return false;
      }
    }

    return true;
  }

  public String toString() {
    return String.format("Game %d, Grabs: %s", this.id, this.grabs);
  }

  public Integer minCountPower() {
    Integer minRed = 0;
    Integer minGreen = 0;
    Integer minBlue = 0;

    for(Grab grab : this.grabs) {
      if (grab.count(Cube.CubeColour.RED) > minRed) {
        minRed = grab.count(Cube.CubeColour.RED);
      }
      if (grab.count(Cube.CubeColour.GREEN) > minGreen) {
        minGreen = grab.count(Cube.CubeColour.GREEN);
      }
      if (grab.count(Cube.CubeColour.BLUE) > minBlue) {
        minBlue = grab.count(Cube.CubeColour.BLUE);
      }
    }
    return minRed * minGreen * minBlue;
  }
}