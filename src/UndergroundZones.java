
import java.util.Scanner;

/**
 *
 * @author Kaamil Jasani
 */
public class UndergroundZones {
    
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
    
    public static String getInput(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
    
    public static int mileEnd(){
        return 2;
    }
    
    public static int aldgateEast(){
        return 1;
    }
    
    public static int woodford(){
        return 4;
    }
    
    public static int westHarrow(){
        return 5;
    }
    
    public static int highgate(){
        return 3;
    }
    
}
