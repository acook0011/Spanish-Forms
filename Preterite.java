
/**
 * Write a description of class Preterite here.
 *
 * @aj
 * @preterite
 */
public class Preterite
{
    public String firstS(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "é";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "í";
        return conj;
    }
    
    public String secondS(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "aste";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "iste";
        return conj;
    }
    
    public String thirdS(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "ó";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "ió";
        return conj;
    }
    
    public String firstP(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "amos";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "imos";
        return conj;
    }
    
    public String secondP(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "asteis";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "isteis";
        return conj;
    }
    
    public String thirdP(String inf){
        String base = inf.substring(0,inf.length()-2);
        String conj = null;
        if (inf.substring(inf.length()-2,inf.length()).equals("ar"))
            conj = base + "aron";
        if (inf.substring(inf.length()-2,inf.length()).equals("er") ||
            inf.substring(inf.length()-2,inf.length()).equals("ir"))
            conj = base + "ieron";
        return conj;
    }
}
