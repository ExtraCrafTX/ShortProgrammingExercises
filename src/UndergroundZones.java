/**
 * This program asks the user for a tube station
 * and tells them which zone it is in.
 */

//Imports scanner utility to allow user input
import java.util.Scanner;

/**
 *
 * @author Kaamil Jasani
 */
public class UndergroundZones {
    
    //Main method executed on launch. Calls the other methods in order to get
    //input and calls the apropriate method based on the name that is input
    public static void main(String[] args) {
        String station = getInput("Which station would you like to know the zone of?").toLowerCase();
        if(station.contains("mile end")){
            System.out.println("Mile end is in zone " + mileEnd());
        }else if(station.contains("aldgate east")){
            System.out.println("Aldgate east is in zone " + aldgateEast());
        }else if(station.contains("woodford")){
            System.out.println("Woodford is in zone " + woodford());
        }else if(station.contains("west harrow")){
            System.out.println("West harrow is in zone " + westHarrow());
        }else if(station.contains("highgate")){
            System.out.println("Highgate is in zone " + highgate());
        }else{
            System.out.println("I don't recognise that station. Check your spelling.");
        }
    }
    
    //Gets input from the user
    public static String getInput(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
    
    //Returns the zone for Mile End
    public static int mileEnd(){
        return 2;
    }
    
    //Returns the zone for Aldgate East
    public static int aldgateEast(){
        return 1;
    }
    
    //Returns the zonr for Woodford
    public static int woodford(){
        return 4;
    }
    
    //Returns the zone for West Harrow
    public static int westHarrow(){
        return 5;
    }
    
    //Returns the zone for Highgate
    public static int highgate(){
        return 3;
    }
    
}
