import java.util.ArrayList;

class PartTwo {
    public static void main(String[] args) {
      // read the file input.txt into a string
        ArrayList<Game> games = GameCollector.collect(false);

        Integer powerSum = 0;
        for (Game game : games) {
          powerSum += game.minCountPower();
        }        
        System.out.println("Sum of min count power: " + powerSum);
    }
}
