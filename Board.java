/**
 * class printing the result from our choice
 */
public class Board {

    public void printBicycle(){
        String userInput = "Bicycle";
        Factory.getToys(userInput);
        System.out.println("Bicycle");
    }

    public void printDolls(){
        String userInput = "Doll";
        Factory.getToys(userInput);
        System.out.println("Doll");
    }
}
