public class Main {
  public static void main(String[] args) {

    System.out.println("  ");

    System.out.println("**********Pluralize*********");

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
    
    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    System.out.println("  ");
  }

  // Accepts the word and appends 's' at the end of the string
  private static String pluralize(String word, int count)
  {
    if (count == 0 || count > 1 ){
    return word + "s";
    }
    else{
      return word;
    }
  }
  }
