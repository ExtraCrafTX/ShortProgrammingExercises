/**
 * This program takes a room number as an input from the user
 * and gives them a short description about a painting in that
 * room.
 */

//Import the scanner utility to get keyboard input
import java.util.Scanner;

/**
 *
 * @author Kaamil Jasani
 */
public class ArtGallery {
    
    /**
     * Main method executed when program is launched,
     * Initialises records for the paintings and
     * calls other methods to get input from the user.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        //Initialise first painting
        Painting p1 = new Painting();
        setLocation(p1, "ahead of you");
        setPainter(p1, "Mary Cassatt");
        setYear(p1, 1879);
        setName(p1, "Woman with a Pearl Necklace in a Loge");
        setWidth(p1, 81.3f);
        setHeight(p1, 59.7f);
        
        //Initialise second painting
        Painting p2 = new Painting();
        setLocation(p2, "ahead of you");
        setPainter(p2, "Rembrandt");
        setYear(p2, 1659);
        setName(p2, "Self-portrait with Beret and Turned-up Collar");
        setWidth(p2, 84.5f);
        setHeight(p2, 66f);
        
        //Initialise third painting
        Painting p3 = new Painting();
        setLocation(p3, "on the left");
        setPainter(p3, "Olga Boznanska");
        setYear(p3, 1894);
        setName(p3, "Girl with Chrysanthemums");
        setWidth(p3, 88.5f);
        setHeight(p3, 69f);
        
        //Initialise fourth painting
        Painting p4 = new Painting();
        setLocation(p4, "on your right");
        setPainter(p4, "Claude Monet");
        setYear(p4, 1872);
        setName(p4, "Impression, Sunrise");
        setWidth(p4, 48f);
        setHeight(p4, 63f);
        
        //Call method getRoom to get user's input and stores it
        int room = getRoom();
        
        //Checks the room number and calls outputPainting with the appropriate painting passed as the argument
        if(room == 1){
            outputPainting(p1);
        }else if(room == 2){
            outputPainting(p2);
        }else if(room == 3){
            outputPainting(p3);
        }else if(room == 4){
            outputPainting(p4);
        }
        //If input is not recognised, tell the user so
        else{
            System.out.println("That room does not exist.");
        }
    }
    
    /**
     * Gets the input from the user
     * @return Room number input by user
     */
    public static int getRoom(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What room are you in? (Only numbers please)");
        return scanner.nextInt();
    }
    
    /**
     * Outputs details about the painting passed in
     * @param p The painting whose details should be shown
     */
    public static void outputPainting(Painting p){
        System.out.println("The painting " + getLocation(p) + " is by " + getPainter(p) + ".");
        System.out.println("It was painted in " + getYear(p) + " and is called " + getName(p) + ".");
        System.out.println("It is " + getWidth(p) + "cm by " + getHeight(p) + "cm.");
    }
    
    /**
     * Gets the location of the painting
     * @param p Painting to get location of
     * @return Location of painting passed in
     */
    public static String getLocation(Painting p){
        return p.location;
    }
    
    /**
     * Gets the painter who painted the painting
     * @param p The painting to get the painter of
     * @return The name of the painter
     */
    public static String getPainter(Painting p){
        return p.painter;
    }
    
    /**
     * Gets the year the painting was painted in
     * @param p The painting to get the year of
     * @return The year it was painted in
     */
    public static int getYear(Painting p){
        return p.year;
    }
    
    /**
     * Gets the name of the painting
     * @param p The painting to get the name of
     * @return The name of the painting
     */
    public static String getName(Painting p){
        return p.name;
    }
    
    /**
     * Gets the width of the painting in cm
     * @param p The painting to get the width of
     * @return The width of the painting in cm
     */
    public static float getWidth(Painting p){
        return p.width;
    }
    
    /**
     * Gets the height of the painting in cm
     * @param p The painting to get the height of
     * @return The height of the painting in cm
     */
    public static float getHeight(Painting p){
        return p.height;
    }
    
    /**
     * Sets the location of the painting specified
     * @param p The painting to change the location of
     * @param location The location that should be set
     */
    public static void setLocation(Painting p, String location){
        p.location = location;
    }
    
    /**
     * Sets the painter of the painting specified
     * @param p The painting to set the painter of
     * @param painter The name of the painter
     */
    public static void setPainter(Painting p, String painter){
        p.painter = painter;
    }
    
    /**
     * Sets the year the painting was painted in
     * @param p The painting to set the year for
     * @param year The year the painting was painted
     */
    public static void setYear(Painting p, int year){
        p.year = year;
    }
    
    /**
     * Sets the name of the painting specified
     * @param p The painting to set the name of
     * @param name The name of the painting
     */
    public static void setName(Painting p, String name){
        p.name = name;
    }
    
    /**
     * Sets the width of the painting specified
     * @param p The painting to set the width of
     * @param width The width of the painting
     */
    public static void setWidth(Painting p, float width){
        p.width = width;
    }
    
    /**
     * Sets the height of the painting specified
     * @param p The painting to set the height of
     * @param height The height of the painting
     */
    public static void setHeight(Painting p, float height){
        p.height = height;
    }
    
}

//Record class Painting to store each separate painting
class Painting{
    String location;
    String painter;
    int year;
    String name;
    float width, height;
}