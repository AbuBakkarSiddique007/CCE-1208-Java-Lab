class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        Shape c = new Circle(); // Polymorphism
        Shape r = new Rectangle(); // Polymorphism

        System.out.println("Shape Output:");
        s.draw();

        System.out.println("\nCircle Output:");
        c.draw();

        System.out.println("\nRectangle Output:");
        r.draw();
    }
}
