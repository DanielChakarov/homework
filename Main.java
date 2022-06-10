/**
 main class running the program
 */
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Santa newSanta = Santa.getInstance(); // instance of Santa
        newSanta.chooseToy();

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        Board newBoard = new Board(); //instance of board class

        switch (choice) {   //printing a toys instead of our choice
            case 1 : newBoard.printBicycle();
            case 2 : newBoard.printDolls();

            default : System.out.println("Invalid input!");
        }





    }
}