/**
 * 
 * @author Kaamil Jasani
 */
public class BigInitials {
    
    public static void main(String[] args) {
        //Calls method to draw big 'K'
        drawK();
        
        //Draws a single line
        System.out.println();
        
        //Calls method to draw big 'J'
        drawJ();
    }//End main
    
    /**
     * Draws the letter 'K'
     */
    public static void drawK(){
        System.out.println("K   K");
        System.out.println("K  K ");
        System.out.println("KKK  ");
        System.out.println("K  K ");
        System.out.println("K   K");
    }//End drawK
    
    /**
     * Draws the letter 'J'
     */
    public static void drawJ(){
        System.out.println("JJJJJ");
        System.out.println("   J ");
        System.out.println("   J ");
        System.out.println("   J ");
        System.out.println("JJJJ ");
    }//End drawJ
    
}//End BigInitials