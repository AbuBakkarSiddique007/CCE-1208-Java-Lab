abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        int result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Calling area() for Circle:");
        circle.area();

        System.out.println("\nCalling area() for Rectangle:");
        rectangle.area();
    }
}
