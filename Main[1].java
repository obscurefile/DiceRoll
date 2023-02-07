import java.util.Random;

class Main {
  public static void main(String[] args) {
    
  //Variables
    int diceRolls = 0;
    int count = 0;

    //Dice roll thing
    while(diceRolls <= 36){
      int die1 = (int)(Math.random() * 6 + 1);
      int die2 = (int)(Math.random() * 6 + 1);
      int diceNumber = die1 + die2;
      System.out.println("You rolled " + diceNumber);
      diceRolls++;
      count++;
      
    //Function for snake eyes thing
      if (diceNumber == 2){
        System.out.println("You rolled " + diceNumber +           ", snake eyes");
        System.out.println("\n" + "It took " + count + " rolls");
        System.exit(0); 
    }
      else if (count == 36 && diceNumber != 2){
        System.out.println("\n" + "You rolled " + count +         " times");
        System.exit(0); 
      }
    }
  }
}