class Student {
    private String name;
    private int id;
    private double cgpa;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Setter for cgpa
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for cgpa
    public double getCgpa() {
        return cgpa;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        // Setting values using setters
        student.setName("Abu Bakkar");
        student.setId(201008);
        student.setCgpa(1.11);

        // Getting and printing values using getters
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student CGPA: " + student.getCgpa());
    }
}
