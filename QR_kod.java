package ora230222;

import java.util.Random;

public class QR_kod {
    private static final String whiteBlokk = "\u001B[0m";
    private static final String yellowBlokk = "\u001B[43m";
    private static final String greenBlokk = "\u001B[42m";
    private static final String[] szinBlokkok = {yellowBlokk, whiteBlokk};
    private static final Random rnd = new Random();
    
    public static void main(String[] args) {
        
        program();
        
    }
    
    
     private static void program() {
        qr(20);
        qr(20);
        qr(20);
        qr(20);
        qr(20);
        qr(20);
        qr(20);
        qr(20);
        qr(20);
        qr(20);
    }

    private static void qr(int hossz) {
        System.out.println(blokkGeneralas(hossz));
    }
    
    private static String blokkGeneralas(int hossz) {
        String szov = "";
        for (int i = 0; i < hossz; i++) {
            szov += szinBlokkok[rnd.nextInt(szinBlokkok.length)] + " ";        
        }
        return szov;
    }
   
}
