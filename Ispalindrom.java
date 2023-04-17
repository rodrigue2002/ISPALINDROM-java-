import org.w3c.dom.css.CSS2Properties;

//Public class Ispalindrom {//voir klausurde herzberg 2018
    public class Ispalindrom {
    public static void main(String[] args) {
        String wort = "abba";
        String wort2 = "reter";
        String wort3 = "klausur";
        System.out.println(new Ispalindrom().ispalindrom(wort));
        System.out.println(new Ispalindrom().ispalindrom(wort2));
        System.out.println(new Ispalindrom().ispalindrom(wort3));
    }                                                                       

      boolean ispalindrom (String wort){
        wort =  wort.toLowerCase();                                     //ici on pouvais directement combiner toutes les deux methodes de string en ecrivant : char[]c = wort.toLowerCase().toCharArray();
       char[] c = wort.toCharArray();
        for (int i = 0, j = c.length - 1; i < c.length; i++, j-- ){      // on pouvais ecrire i < c.length/2 pour que ca rsarrete juste au milieu
            if (c[i]!= c[j]) return false;

        } return true;
    }
}
 /*cest une methode qui verifie sie un mot peut selire dans les deux sens (abba, reter)

AUTRE FACON DE POUVOIR ECRIRE CETTE METHODE SANS TOUTE FOIS DEVOIR METTRE TOUT DABORD DANS UN ARRAY DE CHAR en utilisant la methode charAt des string cette methode permet de comparer les caracteres dun string*/

/*  boolean ispalindrom (String wort){
    for ( int i = 0 , j = wort.length() - 1; i< wort.length(); i++ , j--){
        if (wort.charAt(i)!= wort.charAt(j)) return false;
    } return true;
 }*/
 
 //tolowercase met toute les lettredun string en minuscile et tochararray permet de mettre le string dans un array de char