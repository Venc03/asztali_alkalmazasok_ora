package ora230222;

public class Ora230222 {

    public static void main(String[] args) {

        program();
    }

    private static void program() {
        int a = 3;
        int b = 5;
        int c = 10;
        int d = 2;
        int elso10Osszeg = elso10SzamOsszege();
        kiir(String.format("Elso tiz szam osszege: %d", elso10Osszeg));
        int abOssz = osszead(a, b);
        kiir(String.format("%d + %d = %d", a, b, abOssz));
        int negyOssz = a + b + c + d;
        kiir(String.format("%d + %d + %d + %d = %d", a, b, c, d, negyOssz ));
        
        int osszeg = osszead(a, b);
        osszeg = osszead(osszeg, c);
        kiir(String.format("%d + %d + %d gyoke: ", a, b, c));
        double gyok = Math.sqrt(osszeg);
        String kimenet = String.format("%.4f\n", gyok);
        kiir(kimenet);
    }

    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
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
