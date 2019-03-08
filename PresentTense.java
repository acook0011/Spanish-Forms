
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
        System.out.println(menu() + "Please select one of the options [1-7]:");
        int subject = reader.nextInt();
        // Checks if in range
        while (subject < 1 || subject > 7){
            System.out.println("Error: Not within specified range [1-7]. Try again:");
            subject = reader.nextInt();
        }
        // 
        if (subject == 1){
            System.out.println(firstS(infinitive));
        }
        if (subject == 2){
            System.out.println(secondS(infinitive));
        }
        if (subject == 3){
            System.out.println(thirdS(infinitive));
        }
        if (subject == 4){
            System.out.println(firstP(infinitive));
        }
        if (subject == 5){
            System.out.println(secondP(infinitive));
        }
        if (subject == 6){
            System.out.println(thirdP(infinitive));
        }
        if (subject == 7){
            System.out.println(firstS(infinitive));
            System.out.println(secondS(infinitive));
            System.out.println(thirdS(infinitive));
            System.out.println(firstP(infinitive));
            System.out.println(secondP(infinitive));
            System.out.println(thirdP(infinitive));
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
            conj = base + "ais";
        if (inf.substring(inf.length()-2,inf.length()).equals("er"))
            conj = base + "eis";
        if (inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "is";
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
