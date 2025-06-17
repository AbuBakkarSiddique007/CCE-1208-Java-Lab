/*
 * Task: Multilevel Inheritance: Grandfather → Father → Son
 */

class Grandfather {
    void company() {
        System.out.println("Grandfather owns a business company.");
    }
}

class Father extends Grandfather {
    void car() {
        System.out.println("Father owns a personal car.");
    }
}

class Son extends Father {
    void bike() {
        System.out.println("Son owns a motorbike.");
    }
}

public class Main {
    public static void main(String[] args) {
        Son son = new Son();

        // Accessing methods from all classes via Son
        son.company();
        son.car();
        son.bike();
    }
}
