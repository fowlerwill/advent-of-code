class CubeFactory {
  static Cube fromInput(String input) {
    // System.out.println("Creating Cube from input: " + input);
    Cube.CubeColour colour = Cube.CubeColour.valueOf(input.toUpperCase());
    return new Cube(colour);
  }
}
