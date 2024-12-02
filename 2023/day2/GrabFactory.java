import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GrabFactory {
  static Grab fromInput(String input) {
    System.out.println("Creating Grab from input: " + input);
    Pattern pattern = Pattern.compile("(\\d+) (red|green|blue)");
    ArrayList<Cube> cubes = new ArrayList<Cube>();

    for(String cubesInput : input.split(",")) {
      Matcher matcher = pattern.matcher(cubesInput.trim());
      if (!matcher.matches()) {
        throw new IllegalArgumentException("Invalid Grab input: " + cubesInput);
      }
      Integer count = Integer.parseInt(matcher.group(1));
      for (int i = 0; i < count; i++) {
        cubes.add(CubeFactory.fromInput(matcher.group(2)));
      }
    }

    return new Grab(cubes);
  }
}