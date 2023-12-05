import java.util.ArrayList;

class PartOne {
    public static void main(String[] args) {
      // read the file input.txt into a string
        ArrayList<Game> games = GameCollector.collect();

        System.out.println("Valid games:");
        System.out.println(games);

        Integer validIdSum = 0;
        for (Game game : games) {
          validIdSum += game.id;
        }
        System.out.println("Sum of valid game ids: " + validIdSum);
    }
}
