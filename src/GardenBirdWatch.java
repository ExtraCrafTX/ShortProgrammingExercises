/**
 * Allows the user to enter the name of a bird that they have seen in their garden,
 * and the number of them the user saw at once then reports which bird was the
 * most common.
 */

//Imports the scanner utility to allow user input
import java.util.Scanner;

/**
 * 
 * @author Kaamil Jasani
 */
public class GardenBirdWatch {
    
    public static final String END_CODE = "end";
    public static final String NUM_TOO_SMALL = "Number must be greater than 0.";
    public static final String NO_BIRDS = "You did not see any birds.";
    public static final String MOST_COMMON_1 = "The ";
    public static final String MOST_COMMON_2 = " was the most common bird seen at one time in your garden.";
    public static final String HOW_MANY_1 = "You saw ";
    public static final String HOW_MANY_2 = " of them at once.";
    public static final String Q_WHICH_BIRD = "Which bird did you see?";
    public static final String Q_HOW_MANY_BIRD = "How many did you see at once? (whole number > 0)";
    
    /**
     * Called on launch. Calls various methods in order to run the program
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        //Declare and initialise variables
        int maxNumber = 0;
        String mostSeen = "";
        
        //Gets input for the birds' name
        String input = getBirdName();
        //Loops while the user doesn't input the word 'end'
        while(!input.toLowerCase().equals(END_CODE)){
            int number = getBirdNumber();
            //Makes sure the input is valid, else loops again
            if(number <= 0){
                System.out.println(NUM_TOO_SMALL);
                System.out.println();
                continue;
            }
            if(number > maxNumber){
                maxNumber = number;
                mostSeen = input;
            }
            System.out.println();
            //Gets input again and continues the loop
            input = getBirdName();
        }
        //Make sure some birds were seen, if not, say so
        if(maxNumber == 0){
            System.out.println(NO_BIRDS);
        }
        //Outputs the bird seen the most
        else{
            outputBirdMostSeen(mostSeen, maxNumber);
        }
    }
    
    /**
     * Gets the name of the bird from user input
     * @return The user's input
     */
    public static String getBirdName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(Q_WHICH_BIRD);
        return scanner.nextLine();
    }
    
    /**
     * Gets the number of birds from the user
     * @return The user's input
     */
    public static int getBirdNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(Q_HOW_MANY_BIRD);
        return scanner.nextInt();
    }
    
    /**
     * Outputs the bird that was seen the most
     * @param name The name of the bird
     * @param number The number seen
     */
    public static void outputBirdMostSeen(String name, int number){
        System.out.println(MOST_COMMON_1 + name + MOST_COMMON_2);
        System.out.println(HOW_MANY_1 + number + HOW_MANY_2);
    }
    
}
