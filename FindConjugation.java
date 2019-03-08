
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
        
        // Select subject & plurality
        System.out.println(menu() + "Please select one of the options [1-7]:");
        int subject = reader.nextInt();
        while (subject < 1 || subject > 7){ // Checks if in range of options
            System.out.println("Error: Not within specified range [1-7]. Try again:");
            subject = reader.nextInt();
        }
        
        // 'Yo' choice
        if (subject == 1){
            System.out.println(firstS(infinitive));
        }
        // 'Tú' choice
        if (subject == 2){
            System.out.println(secondS(infinitive));
        }
        // 'Él/Ella/Usted' choice
        if (subject == 3){
            System.out.println(thirdS(infinitive));
            }
        // 'Nosotros/as' choice
        if (subject == 4){
            System.out.println(firstP(infinitive));
        }
        // 'Vosotros/as' choice
        if (subject == 5){
            System.out.println(secondP(infinitive));
        }
        // 'Ellos/Ellas/Ustedes' choice
        if (subject == 6){
            System.out.println(thirdP(infinitive));
        }
        // 'All' choice
        if (subject == 7){
            System.out.println(firstS(infinitive) +
                               secondS(infinitive) +
                               thirdS(infinitive) +
                               firstP(infinitive) +
                               secondP(infinitive) +
                               thirdP(infinitive));
        }
        
        String contChoice = null;
        reader.nextLine(); // Clear
        System.out.println("\nDo you have more verbs? [Y/N]");
        contChoice = reader.nextLine();
        if (contChoice.equalsIgnoreCase("n") || contChoice.equalsIgnoreCase("no")){
            System.out.println("Good luck with your Spanish classes.");
            haveVerb = false;
        }
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
    
    public void checkLength(){
        
    }
    
    public static String firstS(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = base + "o";
        return conj;
    }
    
    public static String secondS(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "as";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "es";
        return conj;
    }
    
    public static String thirdS(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "a";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "e";
        return conj;
    }
    
    public static String firstP(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "amos";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "emos";
        return conj;
    }
    
    public static String secondP(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "áis";
        if (inf.substring(inf.length()-2,inf.length()).equals("er"))
            conj = base + "éis";
        if (inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "ís";
        return conj;
    }
    
    public static String thirdP(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "an";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "en";
        return conj;
    }
}
