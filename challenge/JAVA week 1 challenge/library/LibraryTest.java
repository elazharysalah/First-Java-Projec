package library;
import library.*;

public class LibraryTest {
    public static void main(String[] args) {
        // Create an instance of Book
        Book book = new Book("Java Programming", "John Doe");
        
        // Display book info
        System.out.println(book.getBookInfo());
        
        // Borrow the book
        System.out.println("Borrowing the book...");
        book.borrowBook();
        System.out.println("Availability after borrowing: " + book.getBookInfo().contains("false"));

        // Try to borrow the book again
        System.out.println("Trying to borrow the book again...");
        book.borrowBook();

        // Return the book
        System.out.println("Returning the book...");
        book.returnBook();
        System.out.println("Availability after returning: " + book.getBookInfo().contains("true"));
    }
}
