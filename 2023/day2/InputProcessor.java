import java.util.ArrayList;

class InputProcessor {
  String input;
  InputProcessor(String input) {
    this.input = input;
  }

  public ArrayList<String> process() {
    System.out.println("Processing input");
    ArrayList<String> games = new ArrayList<String>();
    String[] lines = this.input.split("\n");
    for (String line : lines) {
      if (line.startsWith("Game ")) {
        games.add(line);
      }
    }
    return games;
  }
}
