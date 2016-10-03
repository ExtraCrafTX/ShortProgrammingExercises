//Imports Scanner class
import java.util.Scanner;

/**
 * 
 * @author Kaamil Jasani
 */
public class FitnessAge {
    
    public static void main(String[] args) {
        //Gets the average score from two tests
        float average = getAverageScore();
        //Outputs average score
        System.out.println("Your average score is " + average + ".");
        
        //Gets the fitness age by passing in the average score
        int fitAge = getFitAge(average);
        //Outputs the fitness age
        System.out.println("Your PC fitness age is " + fitAge + " years.");
        
        //Gets the difference between the actual age by passing in the fitness age
        int difference = getDifference(fitAge);
        //Outputs age difference
        System.out.println("You are " + difference + " away from your PC fitness age.");
    }//End main
    
    /**
     * Gets an input from the user
     * @param message The message to display for input
     * @return The integer input provided by the user
     */
    public static int getInput(String message){
        //Creates a new Scanner
        Scanner scanner = new Scanner(System.in);
        
        //Outputs message provided as parameter
        System.out.println(message);
        
        //Returns the user's input
        return scanner.nextInt();
    }//End getInput
    
    /**
     * Gets scores for two tests from the user and calculates average
     * @return The average score for the two tests
     */
    public static float getAverageScore(){
        //Gets the first score and stores it
        int score1 = getInput("What was your score for test 1?");
        //Gets the second score and stores it
        int score2 = getInput("What was your score for test 2?");
        
        //Returns the average of the two scores
        return (score1 + score2)/2f;
    }//End getAverageScore
    
    /**
     * Calculates fitness age from average score
     * @param average The average score from the two tests
     * @return Integer fitness age
     */
    public static int getFitAge(float average){
        //Returns the rounded fitness age calculated from average
        return Math.round((average * 8)/5 + 10);
    }//End getFitAge
    
    /**
     * Gets user's real age and calculates difference to fitness age
     * @param fitAge The user's fitness age
     * @return The integer difference between the user's age and fitness age
     */
    public static int getDifference(int fitAge){
        //Gets user's real age and stores it
        int age = getInput("What is your real age?");
        
        //Returns the difference between actual and fitness age
        return age - fitAge;
    }//End getDifference
    
}//End FitnessAge