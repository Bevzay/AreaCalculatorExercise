public class AreaCalculator {

    /*
     * Write a method named area with one double parameter named radius
     *
     * The method needs to return a double value that represents the area of a circle
     *
     * Write another overloaded method with 2 parameters x and y (both doubles),
     * where x and y represent the sides of a rectangle
     *
     * The method needs to return an area of a rectangle
     *
     * If either both parameters is/are a negative return -1.0 to indicate an invalid value
     *
     * TIP:
     * - area of triangle: x * y
     * - area of circle: radius * radius * PI
     */

    public static double area(double radius) {
        if(radius < 0) {
            return -1.0;
        } else {
            return Math.PI * radius * radius;
        }
    }

    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            return -1.0;
        } else {
            return x * y;
        }
    }

}
