
public class Shapes {
    
    static int rectArea(int a, int b) {
        int result = a * b;
        return result;
    }
    
    static int volumen(int a, int b, int c) {
        int result = rectArea(a, b) * c;
        return result;
    }
    
    static int oberflaeche(int a, int b, int c) {
        return 2 * (a * b + b * c + a * c);
    }

}
