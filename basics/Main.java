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
    System.out.println("**********Flipping Coins*********");

    flipNHeads(2);
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
  
  // Flip N heads
  private static void flipNHeads(int headsToGet)
  {
    int headCounter = 0;
    int totalHeads = 0;
    for(int i =0 ; i<=headCounter; i++)
    {
       double headOrTail = Math.random();
       headCounter++;

       if (headOrTail < 0.5)
       {
         System.out.println("tails");
         totalHeads = 0;
       }
       else{
        totalHeads++;
        System.out.println("heads");
        if (totalHeads == headsToGet)
        {
          int j = i+1;
          System.out.println("It took " + j + " flips to flip 2 heads in a row.");
          headCounter = 0;
        }
       }
    }
  }
  }
