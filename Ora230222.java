package ora230222;
public class Ora230222 {
    
    public static void main(String[] args) {
        

    }
    
    private static int elso10SzamOsszege(int max) {
        int osszeg = 0;
        for (int i = 0; i < max; i++) {
            osszeg += i;
        }
        return osszeg;
    }
    
    private static int osszead(int a, int b) {
        return a + b;
    }
    
    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }

    
}