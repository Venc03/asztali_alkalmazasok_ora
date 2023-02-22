package ora230222;

public class Ora230222 {

    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int elso10Osszeg = elso10SzamOsszege();
        kiir(String.format("Elso tiz szam osszege: %d", elso10Osszeg));
        int abOsszeg = osszead(a, b);
        kiir(String.format("%d + %d = %d", a, b, abOsszeg));
        
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
