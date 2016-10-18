/**
 * This program takes the profit and hardwork score of an employee,
 * calculates the performance score and also calculates the bonus that
 * they should receive.
 */

//Imports the scanner utility for taking keyboard input
import java.util.Scanner;

/**
 *
 * @author Kaamil Jasani
 */
public class BonusScheme {
    
    //Declare and initialise constants
    public static final String QUESTION_PROFIT_SCORE = "Profit score? (whole number > 0)";
    public static final String QUESTION_HARDWORK_SCORE = "Hard work score? (whole number > 0)";
    public static final String PERFORMANCE_SCORE_1 = "Your performance score this year is ";
    public static final String PERFORMANCE_SCORE_2 = " out of 10.";
    public static final String BONUS = "Your bonus is £";
    public static final int PROFIT_MULTIPLIER = 2;
    public static final int HARDWORK_MULTIPLIER = 5;
    public static final int PERFORMANCE_DIVIDER = 7;
    public static final int BONUS_MULTIPLIER = 5000;
    
    //Main method executed on launch, calls calculateBonus which handles the program
    public static void main(String[] args) {
        calculateBonus();
    }
    
    /**
     * Used to multiply the profitScore before calculating the performance
     * @param profitScore The employee's profit score
     * @return The profit score * 2
     */
    public static int multiply2(int profitScore){
        return profitScore*PROFIT_MULTIPLIER;
    }
    
    /**
     * Used to multiply the hardwork score before calculating the performance
     * @param hardWorkScore The employee's hardwork score
     * @return The hardwork score * 5
     */
    public static int multiply5(int hardWorkScore){
        return hardWorkScore*HARDWORK_MULTIPLIER;
    }
    
    /**
     * Calculates the performance score for the given employee
     * @param employee The employee to calculate performance for
     * @return The performance score for the employee
     */
    public static int getPerformanceScore(Employee employee){
        int profitScore = multiply2(getProfitScore(employee));
        int hardWorkScore = multiply5(getHardWorkScore(employee));
        int performanceScore = (profitScore + hardWorkScore)/PERFORMANCE_DIVIDER;
        return performanceScore;
    }
    
    /**
     * Calculates the bonus that the employee should receive from performance score
     * @param performanceScore The employees performance score
     * @return The bonus to be received by the employee
     */
    public static int getBonus(int performanceScore){
        return performanceScore*BONUS_MULTIPLIER;
    }
    
    /**
     * Gets input from the user with the message specified
     * @param message The message to display
     * @return The user's input
     */
    public static int getInput(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
    
    /**
     * Carries out the logic of the program by calling the various methods
     */
    public static void calculateBonus(){
        int profitScore = getInput(QUESTION_PROFIT_SCORE);
        int hardWorkScore = getInput(QUESTION_HARDWORK_SCORE);
        
        Employee employee = new Employee();
        setProfitScore(employee, profitScore);
        setHardWorkScore(employee, hardWorkScore);
        
        int performanceScore = getPerformanceScore(employee);
        System.out.println(PERFORMANCE_SCORE_1 + performanceScore + PERFORMANCE_SCORE_2);
        
        int bonus = getBonus(performanceScore);
        System.out.println(BONUS + bonus + ".");
    }
    
    /**
     * Gets the profit score for the specified employee
     * @param employee The employee to get the profit score for
     * @return The profit score
     */
    public static int getProfitScore(Employee employee){
        return employee.profitScore;
    }
    
    /**
     * Gets the hardwork score for the specified employee
     * @param employee The employee to get the hardwork score for
     * @return The hardwork score
     */
    public static int getHardWorkScore(Employee employee){
        return employee.hardWorkScore;
    }
    
    /**
     * Sets the profit score for the specified employee
     * @param employee The employee to set the profit score for
     * @param profitScore The profit score
     */
    public static void setProfitScore(Employee employee, int profitScore){
        employee.profitScore = profitScore;
    }
    
    /**
     * Sets the hardwork score for the specified employee
     * @param employee The employee to set the score for
     * @param hardWorkScore The hardwork score
     */
    public static void setHardWorkScore(Employee employee, int hardWorkScore){
        employee.hardWorkScore = hardWorkScore;
    }
    
}

//Record class to store details of employee
class Employee{
    int profitScore;
    int hardWorkScore;
}