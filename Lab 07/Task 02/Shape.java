public class Shape {

    // Rectangle area method
    static void area(int length, int width) {
        System.out.println("Area of the rectangle: " + (length * width));
    }

    // Circle area method (uses double for radius)
    static void area(double radius) {
        System.out.println("Area of the circle: " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        System.out.println("Calculating Circle Area:");
        area(4.0);

        System.out.println("\nCalculating Rectangle Area:");
        area(8, 12);
    }
}
