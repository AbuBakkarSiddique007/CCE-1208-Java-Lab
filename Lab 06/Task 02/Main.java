/*
 * Task: Hierarchical Inheritance: Person → Doctor / Teacher / Engineer
 */

class Person {
    void displayInfo() {
        System.out.println("This is a person.");
    }
}

class Doctor extends Person {
    void treatPatients() {
        System.out.println("Doctor treats patients.");
    }
}

class Teacher extends Person {
    void teachStudents() {
        System.out.println("Teacher teaches students.");
    }
}

class Engineer extends Person {
    void developSoftware() {
        System.out.println("Engineer develops software.");
    }
}

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Teacher teacher = new Teacher();
        Engineer engineer = new Engineer();

        System.out.println("Doctor's Info:");
        doctor.displayInfo();
        doctor.treatPatients();

        System.out.println("\nTeacher's Info:");
        teacher.displayInfo();
        teacher.teachStudents();

        System.out.println("\nEngineer's Info:");
        engineer.displayInfo();
        engineer.developSoftware();
    }
}
