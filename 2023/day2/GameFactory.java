import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.regex.Matcher;

class GameFactory {
  static Game fromInput(String input, Boolean validate) {
    System.out.println("Creating Game from input: " + input);
    Pattern pattern = Pattern.compile("^Game (\\d+): (.*)");
    Matcher matcher = pattern.matcher(input);
    if (!matcher.matches()) {
      throw new IllegalArgumentException("Invalid Game input");
    }
    Integer id = Integer.parseInt(matcher.group(1));
    ArrayList<Grab> grabs = new ArrayList<Grab>();
    
    for (String grabInput : matcher.group(2).split(";")) {
      grabs.add(GrabFactory.fromInput(grabInput));
    }
    
    return new Game(id, grabs, validate);
  }
}