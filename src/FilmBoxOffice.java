/**
 * This program takes information about the films in a cinema
 * and outputs them in a way suitable for display.
 */

//Imports scanner utility for user input
import java.util.Scanner;

/**
 *
 * @author Kaamil Jasani
 */
public class FilmBoxOffice {
    
    /**
     * Run at launch, calls various methods to run the program
     * @param args 
     */
    public static void main(String[] args) {
        //Creates a new array of Films
        Film[] films = new Film[4];
        //Loops through the array and initialises it with the user's input
        for(int i = 0; i < films.length; i++){
            films[i] = new Film();
            int screen = i+1;
            setScreen(films[i], screen);
            setName(films[i], inputName(screen));
            setStartHour(films[i], inputHour());
            setStartMinutes(films[i], inputMinutes());
        }
        //Outputs the films in a good format
        outputFilms(films);
    }
    
    /**
     * Allows the user to input a name for a film for the specified screen
     * @param screen The screen the movie will be shown on
     * @return The user's input
     */
    public static String inputName(int screen){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Film for Screen " + screen + "?");
        return scanner.nextLine();
    }
    
    /**
     * Allows user to input the hour that the movie will start at
     * @return The user's input
     */
    public static int inputHour(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What time does it start? (Hour)");
        int hour = scanner.nextInt();
        if(hour  < 0 || hour > 23){
            System.out.println("Please input a valid hour (0-23).");
            return inputHour();
        }else{
            return hour;
        }
    }
    
    /**
     * Allows the user to input the minutes past the hour the movie will start at
     * @return The user's input
     */
    public static int inputMinutes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What time does it start? (Minutes past the hour)");
        int minutes = scanner.nextInt();
        if(minutes < 0 || minutes > 59){
            System.out.println("Please input valid minutes (0-59).");
            return inputMinutes();
        }else{
            return minutes;
        }
    }
    
    /**
     * Outputs the films in a presentable format
     * @param films The array of films to output
     */
    public static void outputFilms(Film[] films){
        System.out.println("CinemaWorld films today:");
        for(Film film : films){
            System.out.println("Screen " + getScreen(film) + ": " + getName(film) + "\t" + formatTime(getStartHour(film)) + ":" + formatTime(getStartMinutes(film)));
        }
    }
    
    /**
     * Formats the time to ensure it is two digits
     * @param time The time to format
     * @return The formatted time
     */
    public static String formatTime(int time){
        if(time < 10){
            return "0" + time;
        }else{
            return "" + time;
        }
    }
    
    /**
     * Gets the screen the film will be shown on
     * @param film The film to get the screen for
     * @return The screen it will be displayed on
     */
    public static int getScreen(Film film){
        return film.screen;
    }
    
    /**
     * Gets the name of the specified film
     * @param film The film to get the name of
     * @return The name of the film
     */
    public static String getName(Film film){
        return film.name;
    }
    
    /**
     * Gets the hour the specified movie will start at
     * @param film The film to get the start time for
     * @return The hour the film starts at
     */
    public static int getStartHour(Film film){
        return film.startHour;
    }
    
    /**
     * Gets the minutes past the hour the movie will start
     * @param film The film to get the time for
     * @return The minutes past the hour it will start
     */
    public static int getStartMinutes(Film film){
        return film.startMinutes;
    }
    
    /**
     * Sets the screen the film will be displayed on
     * @param film The film to set the screen for
     * @param screen The screen it will be shown on
     */
    public static void setScreen(Film film, int screen){
        film.screen = screen;
    }
    
    /**
     * Sets the name of the specified film
     * @param film The film to set the name of
     * @param name The name of the film
     */
    public static void setName(Film film, String name){
        film.name = name;
    }
    
    /**
     * Sets the start hour of the specified film
     * @param film The film to set the start hour of
     * @param startHour The start hour for the film
     */
    public static void setStartHour(Film film, int startHour){
        film.startHour = startHour;
    }
    
    /**
     * Sets the minutes past the hour for the specified film
     * @param film The film to set the minutes for
     * @param startMinutes The minutes past the hour
     */
    public static void setStartMinutes(Film film, int startMinutes){
        film.startMinutes = startMinutes;
    }
    
}

//Record for films
class Film{
    int screen;
    String name;
    int startHour;
    int startMinutes;
}