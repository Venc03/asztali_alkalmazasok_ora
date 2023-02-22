package ora230222;

import java.util.Random;

public class Equalizer {
    private static final Random rnd = new Random();
    
    public static void main(String[] args) {
        
        hossz();
        
    }

    private static void hossz() {
        for (int i = 0; i < 5; i++) {
            eq();
        }
    }

    private static void eq() {
        String szov = "";
        int r = rnd.nextInt(5)+3;
        for (int i = 0; i < r; i++) {
            szov += "\u001B[45m" + " ";
            
        }
        System.out.println(szov);
    }
    
}
