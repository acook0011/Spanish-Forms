
/**
 * Transforms infinitive Spanish verbs into the specified present-tense.
 *
 * @aj
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class FindConjugation
{
    public static void main(String[]args){
     Scanner reader = new Scanner(System.in);
     String infinitive; 
     Present conj = new Present();
     Boolean haveVerb = true;
     // Goes until user quits
        while (haveVerb){
        // Finds the infinitive
        System.out.println("Type out an infinitive verb:");
        infinitive = reader.nextLine().toLowerCase(); // Sets casing to avoid confusion
        int vLength = infinitive.length();
        
        // Finds pronouns and removes for future use
        
        
        // Checks if proper verb by checking length & ending
        while (vLength <= 1 || // Checks length first to avoid crashing
               !infinitive.substring(vLength-2,vLength).equals("ar") &&
               !infinitive.substring(vLength-2,vLength).equals("er") &&
               !infinitive.substring(vLength-2,vLength).equals("ir")){
                System.out.println("Not an infinitive verb.\n" +
                                   "Type out an infinitive verb:");
                infinitive = reader.nextLine();
                vLength = infinitive.length();
        }
        
        // Select tense
        System.out.println(menuT() + "Please select one of the options [1-2]: ");
        int tense = reader.nextInt();
        while (tense < 1 || tense > 7){ // Checks if in range of options
            System.out.print("Error: Not within specified range [1-2]. Try again: ");
            tense = reader.nextInt();
        }
        
        // Select subject & plurality
        System.out.println(menuF() + "Please select one of the options [1-7]:");
        int subject = reader.nextInt();
        while (subject < 1 || subject > 7){ // Checks if in range of options
            System.out.println("Error: Not within specified range [1-7]. Try again:");
            subject = reader.nextInt();
        }
        // 'Present' choice
        if (tense == 1){
            Prese(subject, infinitive);
        }
        // 'Preterite' choice
        if (tense == 2){
            Prete(subject, infinitive);
        }
        
        String contChoice = null;
        reader.nextLine(); // Clears
        System.out.println("Do you have more verbs? [Y/N]");
        contChoice = reader.nextLine();
        if (contChoice.equalsIgnoreCase("n") || contChoice.equalsIgnoreCase("no")){
            System.out.println("Good luck with your Spanish classes.");
            haveVerb = false;
        }
     }
    }
    
    // Menu of tenses
    public static String menuT(){
        return "1) Present\n" +
               "2) Preterite\n";
        // More added as program updated
    }
    
    // Menu of persons/plurality
    public static String menuF(){
        return "1) Yo\n" +
               "2) Tú\n" +
               "3) Él/Ella/Usted\n" +
               "4) Nosotros/as\n" +
               "5) Vosotros/as\n" +
               "6) Ellos/Ellas/Ustedes\n" +
               "7) All\n";
    }
    
    // Present conjugations
    public static void Prese(int subject, String infinitive){
        Present conj = new Present();      
        // 'Yo' choice
        if (subject == 1){
            System.out.println(conj.firstS(infinitive));
        }
        // 'Tú' choice
        if (subject == 2){
            System.out.println(conj.secondS(infinitive));
        }
        // 'Él/Ella/Usted' choice
        if (subject == 3){
            System.out.println(conj.thirdS(infinitive));
            }
        // 'Nosotros/as' choice
        if (subject == 4){
            System.out.println(conj.firstP(infinitive));
        }
        // 'Vosotros/as' choice
        if (subject == 5){
            System.out.println(conj.secondP(infinitive));
        }
        // 'Ellos/Ellas/Ustedes' choice
        if (subject == 6){
            System.out.println(conj.thirdP(infinitive));
        }
        // 'All' choice
        if (subject == 7){
            System.out.println(conj.firstS(infinitive) + "\n" +
                               conj.secondS(infinitive) + "\n" +
                               conj.thirdS(infinitive) + "\n" +
                               conj.firstP(infinitive) + "\n" +
                               conj.secondP(infinitive) + "\n" +
                               conj.thirdP(infinitive) + "\n");
        }
    }
    
    // Preterite Conjugations
    public static void Prete(int subject, String infinitive){
        Preterite conj = new Preterite();      
        // 'Yo' choice
        if (subject == 1){
            System.out.println(conj.firstS(infinitive));
        }
        // 'Tú' choice
        if (subject == 2){
            System.out.println(conj.secondS(infinitive));
        }
        // 'Él/Ella/Usted' choice
        if (subject == 3){
            System.out.println(conj.thirdS(infinitive));
            }
        // 'Nosotros/as' choice
        if (subject == 4){
            System.out.println(conj.firstP(infinitive));
        }
        // 'Vosotros/as' choice
        if (subject == 5){
            System.out.println(conj.secondP(infinitive));
        }
        // 'Ellos/Ellas/Ustedes' choice
        if (subject == 6){
            System.out.println(conj.thirdP(infinitive));
        }
        // 'All' choice
        if (subject == 7){
            System.out.println(conj.firstS(infinitive) + "\n" +
                               conj.secondS(infinitive) + "\n" +
                               conj.thirdS(infinitive) + "\n" +
                               conj.firstP(infinitive) + "\n" +
                               conj.secondP(infinitive) + "\n" +
                               conj.thirdP(infinitive) + "\n");
        }
    }
}
