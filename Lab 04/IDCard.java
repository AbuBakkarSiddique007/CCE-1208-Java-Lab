/*
 * Task No: 2
 * Task Name: Create an IDCard class using a constructor
 * Objective: Create an IDCard class with attributes (name, id, department, institution),
 *            initialize them using a constructor, and display the ID details using a method.
 */

public class IDCard {
    String name;
    String id;
    String department;
    String institution;

    public IDCard(String name, String id, String department, String institution) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.institution = institution;
    }

    public void showID() {
        System.out.println("Name       : " + name);
        System.out.println("ID         : " + id);
        System.out.println("Department : " + department);
        System.out.println("Institution: " + institution);
    }

    public static void main(String[] args) {
        IDCard myID = new IDCard("Abu Bakkar Siddique", "E201008", "CCE", "IIUC");
        myID.showID();
    }
}
