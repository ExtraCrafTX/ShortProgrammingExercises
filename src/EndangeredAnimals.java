/**
 * This program asks for how many individuals of a given species are
 * left in the wild and outputs the most endangered, along with a
 * comma separated list of all the data that can easily be imported
 * into spreadsheet software
 */

//Imports the scanner utility to allow user input
import java.util.Scanner;

/**
 *
 * @author Kaamil Jasani
 */
public class EndangeredAnimals {
    
    /**
     * Main class executed on launch, manages program by calling
     * various methods
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        //Creates a new array and loops through it to initialise it
        Animal[] animals = new Animal[5];
        
        for(int i = 0; i < animals.length; i++){
            animals[i] = new Animal();
        }
        
        //Initialises each instance in the array
        setName(animals[0], "Komodo Dragon");
        setName(animals[1], "Manatee");
        setName(animals[2], "Kakapo");
        setName(animals[3], "Florida Panther");
        setName(animals[4], "White Rhino");
        
        //Decalre new record to store most endangered animal and initialise it
        Animal mostEndangered = new Animal();
        setLeft(mostEndangered, 0);
        
        //Loop through array of animals to get input for each
        for (Animal animal : animals) {
            System.out.println(getName(animal) + ":");
            int left = getInputLeft();
            setLeft(animal, left);
            //Checks the number left and updates the most endangered if necessary
            if(getLeft(mostEndangered) == 0){
                mostEndangered = animal;
            }else if(getLeft(mostEndangered) > left){
                mostEndangered = animal;
            }
            //Empty line
            System.out.println();
        }
        outputMostEndangered(mostEndangered);
        System.out.println();
        outputList(animals);
    }
    
    /**
     * Gets the user's input for the number left
     * @return The user's input
     */
    public static int getInputLeft(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many left in the wild? (Whole number > 0)");
        return scanner.nextInt();
    }
    
    /**
     * Outputs details about the most endangered animal
     * @param animal The most endangered animal
     */
    public static void outputMostEndangered(Animal animal){
        System.out.println("The most endangered animal is the " + getName(animal) + ".");
        if(getLeft(animal) == 1){
            System.out.println("There is only " + getLeft(animal) + " left in the wild.");
        }else{
            System.out.println("There are only " + getLeft(animal) + " left in the wild.");
        }
    }
    
    /**
     * Outputs list in comma separated format
     * @param animals The array of all animals
     */
    public static void outputList(Animal[] animals){
        for(Animal animal : animals){
            System.out.println(getName(animal) + "," + getLeft(animal));
        }
    }
    
    /**
     * Gets the name of the specified animal
     * @param a The animal to get the name of
     * @return The name of the animal
     */
    public static String getName(Animal a){
        return a.name;
    }
    
    /**
     * Gets the number of the animal that are left
     * @param a The animal to get the number of
     * @return The number of that animal that are left
     */
    public static int getLeft(Animal a){
        return a.left;
    }
    
    /**
     * Sets the name of the specified animal
     * @param a The animal to set the name of
     * @param name The name to set it to
     */
    public static void setName(Animal a, String name){
        a.name = name;
    }
    
    /**
     * Sets the number of the specified animal
     * @param a The animal to set the number of
     * @param left The number of it there are left
     */
    public static void setLeft(Animal a, int left){
        a.left = left;
    }
    
}

//Record class to store animal details
class Animal{
    String name;
    int left;
}