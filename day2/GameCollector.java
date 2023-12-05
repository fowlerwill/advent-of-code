import java.util.ArrayList;

public class GameCollector {
  public static ArrayList<Game> collect() {
    return collect(true);
  }

  public static ArrayList<Game> collect(Boolean validate) {
    InputOpener inputOpener = new InputOpener();
    String input = inputOpener.open();
    
    InputProcessor inputProcessor = new InputProcessor(input);
    ArrayList<String> gameInputs = inputProcessor.process();
    
    ArrayList<Game> games = new ArrayList<Game>();
    for (String gameInput : gameInputs) {
      try {
        games.add(GameFactory.fromInput(gameInput, validate));
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    return games;
  }
}
