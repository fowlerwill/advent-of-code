

class InputOpener {

  String FILE = "input.txt";

  public String open() {
    String input = "";
    try {
      java.io.File file = new java.io.File(this.FILE);
      java.util.Scanner inputScanner = new java.util.Scanner(file);
      input = inputScanner.useDelimiter("\\A").next();
      inputScanner.close();
    } catch (java.io.FileNotFoundException e) {
      System.out.println("File not found");
    }
    return input;
  }
}