public class Calculator {

    static public int add(int a, int b) {
        return a + b;
    }

    static public double add(double a, double b) {
        return a + b;
    }

    static public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        // Calculator calc = new Calculator();
        // int result1 = calc.add(10, 20);
        // double result2 = calc.add(5.5, 3.3);
        // int result3 = calc.add(1, 2, 3);

        System.out.println("Sum of two integers: " + add(10, 20));
        System.out.println("Sum of two floating-point numbers: " + add(5.5, 3.3));
        System.out.println("Sum of three integers: " + add(1, 2, 3));
    }
}
