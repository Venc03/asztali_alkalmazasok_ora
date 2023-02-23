package ora230222;

import java.util.Random;

public class Equalizer {
    private static final String White = "\u001B[0m";
    private static final String Purple = "\u001B[45m";
    private static final Random rnd = new Random();
    
    public static void main(String[] args) {
        
        program();
        
    }
    
    
     private static void program() {
        eq();
        eq(8, true);
        eq(12);
        eq(true);
        eq();
    }

    private static void eq(int hossz) {
        eq(false);
    }
    
    private static void eq() {
        System.out.println(blokkGeneralas(rnd.nextInt(3, 8)));
    }
   
    private static void eq(int hossz, boolean hosszKiir) {
        String hosszSzoveg = blokkGeneralas(hossz);
        hosszSzoveg += (hosszKiir ? "%s (%d)".formatted(White, hossz) : "");
        System.out.println(hosszSzoveg);
    }
    
    private static void eq(boolean hosszKiir) {
        eq(rnd.nextInt(3, 8), hosszKiir);
    }

    private static String blokkGeneralas(int hossz) {
        String szov = "";
        for (int i = 0; i < hossz; i++) {
            szov += Purple + " ";        
        }
        return szov;
    }
   
}
