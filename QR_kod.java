package ora230222;

import java.util.Random;

public class QR_kod {

    private static final String whiteBlokk = "\u001B[0m";
    private static final String yellowBlokk = "\u001B[43m";
    private static final String greenBlokk = "\u001B[42m";
    private static final String[] szinBlokkok = {yellowBlokk, whiteBlokk};
    private static final String[] kocka = {"%s %s %s %s %s ".formatted(greenBlokk, greenBlokk, greenBlokk, greenBlokk, greenBlokk)
            , "%s %s %s %s %s ".formatted(greenBlokk, whiteBlokk, whiteBlokk, whiteBlokk, greenBlokk)
            , "%s %s %s %s %s ".formatted(greenBlokk, whiteBlokk, greenBlokk, whiteBlokk, greenBlokk)
            , "%s %s %s %s %s ".formatted(greenBlokk, whiteBlokk, whiteBlokk, whiteBlokk, greenBlokk)
            , "%s %s %s %s %s ".formatted(greenBlokk, greenBlokk, greenBlokk, greenBlokk, greenBlokk)};
    
    private static final Random rnd = new Random();

    public static void main(String[] args) {

        program();

    }

    private static void program() {
        kiir(qr());
        kiir(qr(true));
        kiir(qr(20));
        kiir(qr(20, true));
    }

    private static String qr() {
        return qr(false);
    }
    
    private static String qr(int hossz) {
        return qr(hossz, false);
    }
    
    private static String qr(boolean kockakod) {
        return qr(10, kockakod);
    }

    private static String qr(int hossz, boolean kockakod) {
        String szov = "";
        
        for (int i = 0; i < hossz / 2; i++) {
            
            int vege = hossz - ((kockakod) ? ((i < kocka.length) ? kocka.length : 0) : 0);
            
            for (int j = 0; j < vege; j++) {
                szov += szinBlokkok[rnd.nextInt(szinBlokkok.length)] + " ";
            }
            szov += (i < kocka.length) && (kockakod) ? sarokKocka(i) : "";
            szov += "\n";
        }
        return szov;
    }
    
        private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }
    
    private static String sarokKocka(int sor) {
        return kocka[sor];
    }

}
