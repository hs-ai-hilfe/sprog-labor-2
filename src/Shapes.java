
public class Shapes {
    
    /**
     * Calculates the area of a rect
     * 
     * @param a Side a
     * @param b Side b
     * @return the area
     */
    static int areaRect(int a, int b) {
        int result = a * b;
        return result;
    }
    
    /**
     * Calculates the volume of a cuboid
     * 
     * @param a Side a
     * @param b Side b
     * @param c Side c
     * @return the volume of a cuboid
     */
    static int volumeCuboid(int a, int b, int c) {
        int result = areaRect(a, b) * c;
        return result;
    }
    
    /**
     * Calculates the surface of a cuboid
     * 
     * @param a Side a
     * @param b Side b
     * @param c Side c
     * @return the surface of a cuboid
     */
    static int surfaceCuboid(int a, int b, int c) {
        return 2 * (a * b + b * c + a * c);
    }

}
