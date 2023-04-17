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
        wort =  wort.toLowerCase();                                    
       char[] c = wort.toCharArray();
        for (int i = 0, j = c.length - 1; i < c.length; i++, j-- ){      
            if (c[i]!= c[j]) return false;

        } return true;
    }
}
/*PS C:\Users\Hp\Desktop\oop-1\ispalindrom>  & 'C:\Program Files\Eclipse Adoptium\jdk-17.0.6.10-hotspot\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\Hp\AppData\Local\Temp\vscodesws_6e070\jdt_ws\jdt.ls-java-project\bin' 'Ispalindrom' 
true
true
false*/