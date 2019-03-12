
/**
 * Write a description of class PresentTense here.
 *
 * @aj
 * @present
 */
public class Present
{    
    public String firstS(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = base + "o";
        return conj;
    }
    
    public String secondS(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "as";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "es";
        return conj;
    }
    
    public String thirdS(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "a";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "e";
        return conj;
    }
    
    public String firstP(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "amos";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "emos";
        return conj;
    }
    
    public String secondP(String inf){
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
    
    public String thirdP(String inf){
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
