
/**
 * Transforms infinitive Spanish verbs into the specified present-tense.
 *
 * @aj
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class PresentTense
{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        String infinitive;
        
        // Finds the infinitive
        System.out.println("Type out the infinitive verb:");
        infinitive = reader.nextLine();
        
        // Checks if proper verb
        
        
        // Select subject & plurality
        System.out.println(menu() + "Please select one of the options [1-6]:");
        int subject = reader.nextInt();
        // Checks if in range
        while (subject < 1 || subject > 6){
            System.out.println("Error: Not within specified range [1-6]. Try again:");
            subject = reader.nextInt();
        }
        // 
        if (subject == 1){
            // First-singular
        }
        if (subject == 2){
            // Second-singular
        }
        if (subject == 3){
            // Third-singular
        }
        if (subject == 4){
            // First-plural
        }
        if (subject == 5){
            // Second-plural
        }
        if (subject == 6){
            // Third-plural
        }
        if (subject == 7){
            // Lists all
        }
    }
    
    public static String menu(){
        return "1) Yo\n" +
               "2) Tú\n" +
               "3) Él/Ella/Usted\n" +
               "4) Nosotros/as\n" +
               "5) Vosotros/as\n" +
               "6) Ellos/Ellas/Ustedes\n" +
               "7) All\n";
    }
}
