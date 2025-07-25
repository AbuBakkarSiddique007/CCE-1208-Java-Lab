/*
 * Task: Create a LibraryBook Class Using this Keyword
 * Task Description:
 * - Create a class LibraryBook with the following attributes:
 *   - title
 *   - author
 *   - bookID
 *
 * - Use the 'this' keyword in the constructor to initialize values.
 * - Create a method displayBookInfo() to display the book details.
 * - In the main class, create multiple LibraryBook objects and
 *   display their information using the displayBookInfo() method.
 */

class LibraryBook {
    String title;
    String author;
    String bookID;

    // Constructor using 'this' keyword
    LibraryBook(String title, String author, String bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    // Method to display book information
    void displayBookInfo() {
        System.out.println("Book Title : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Book ID    : " + bookID);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Basics", "James Gosling", "LB101");
        LibraryBook book2 = new LibraryBook("Data Structures", "Mark Allen", "LB102");

        System.out.println("Library Book 1 Details:");
        book1.displayBookInfo();

        System.out.println("Library Book 2 Details:");
        book2.displayBookInfo();
    }
}
