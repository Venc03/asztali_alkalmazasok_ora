package ora230222;
public class Ora230222 {
    
    public static void main(String[] args) {
        
        xSzamOssz();

    }
    
    private static void xSzamOssz() {
        int x = 10;
        int ossz = xSzamOssz(x);
        kiiras("elso %d szam oszzeg: %d\n".formatted(x, ossz));
    }
    
    private static int xSzamOssz(int max) {
        int ossz = 0;
        for (int i = 0; i < max; i++) {
            ossz += i;
            
        }
        return ossz;
    }
    
    private static void szamolas(int a, int b) {
        int ossz = a + b;
        kiiras("%d + %d = %d\n".formatted(a, b, ossz));
    }
    
    private static void kiiras(String szov) {
        System.out.println(szov);
    }

    
}