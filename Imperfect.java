
/**
 * Write a description of class Imperfect here.
 *
 * @aj
 * @imperfect
 */
public class Imperfect
{
    public String firstS(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "aba";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "ía";
        return conj;
    }
    
    public String secondS(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "abas";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "ías";
        return conj;
    }
    
    public String thirdS(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "aba";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "ía";
        return conj;
    }
    
    public String firstP(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "ábamos";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "iamos";
        return conj;
    }
    
    public String secondP(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "abais";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "íais";
        return conj;
    }
    
    public String thirdP(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "aban";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "ían";
        return conj;
    }
}
