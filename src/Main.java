public class Main {
    public static void main(String[] args) {

        System.out.println("The area of a circle with r=5.0 is " + AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println("The area of a rectangle with x=5.0 and y=4.0 is " + AreaCalculator.area(5.0, 4.0));
        System.out.println(AreaCalculator.area(-1.0, 4.0));

    }
}
