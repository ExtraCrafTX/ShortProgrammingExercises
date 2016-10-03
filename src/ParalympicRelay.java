/**
 * This program takes disability scores for players on a relay team
 * and calculates the total score, and checks whether the team is legal
 * or not.
 */

//Import scanner utility for allowing user input
import java.util.Scanner;

/**
 *
 * @author Kaamil Jasani
 */
public class ParalympicRelay {
    
    /**
     * Main method executed on launch, gets the scores and checks the total by calling various methods
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        int total = 0;
        for(int i = 1; i <= 4; i++){
            total += getScore(i);
        }
        checkTotal(total);
    }
    
    /**
     * Gets the score for the runner from the user
     * @param runner The number of the runner
     * @return The score input by the user
     */
    public static int getScore(int runner){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the disablility class of runner " + runner + "? (1-10)");
        return scanner.nextInt();
    }
    
    /**
     * Checks the total score to make sure it is valid
     * @param total The total score for the team
     */
    public static void checkTotal(int total){
        if(total > 32){
            System.out.println("This team has " + total + " points so is NOT legal.");
        }else if(total >= 4){
            System.out.println("This team has " + total + " points so is legal.");
        }else{
            System.out.println("You have made an error in your input. Please try again.");
        }
    }
    
}