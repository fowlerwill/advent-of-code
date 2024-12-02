class Cube {

  enum CubeColour {
    RED, GREEN, BLUE
  }

  protected CubeColour colour;

  public Cube(CubeColour colour) {
    this.colour = colour;
    // System.out.println("Creating cube: " + this);
  }

  public String toString() {
    return String.format("Cube %s", this.colour);
  }
}