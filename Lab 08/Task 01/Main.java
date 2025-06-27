class Animal {
    void sound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();  // Polymorphism
        Animal c = new Cat();  // Polymorphism

        System.out.println("Animal makes sound:");
        a.sound();

        System.out.println("\nDog makes sound:");
        d.sound();

        System.out.println("\nCat makes sound:");
        c.sound();
    }
}
