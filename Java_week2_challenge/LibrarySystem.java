package challenge.Java_week2_challenge;

class LibraryItem {
    private String title;
    private String author;
    public LibraryItem(String title, String author) {
    this.title = title;
    this.author = author;
    }
    public String getTitle() {
    return title;
    }
    public String getAuthor() {
    return author;
    }
    public void displayInfo() {
    System.out.println("Title: " + title + ", Author: " + author);
    }
   }
   // Subclass Book
   class Book extends LibraryItem {
    private String genre;
    public Book(String title, String author, String genre) {
    super(title, author);
    this.genre = genre;
    }
    @Override
    public void displayInfo() {
    super.displayInfo();
    System.out.println("Genre: " + genre);
    }
   }
   // Subclass Ebook
   class Ebook extends LibraryItem {
    private double size;
    private String format;
    public Ebook(String title, String author, double size,String format) {
    super(title, author);
    this.size = size;
    this.format = format;
    }
    @Override
    public void displayInfo() {
    super.displayInfo();
    System.out.println("size: " + size + "  format : "+ format);
    }
   }
   // Subclass Ebook
   // Subclass Magazine
   class Magazine extends LibraryItem {
    private int issueNumber;
    public Magazine(String title, String author, int issueNumber) {
    super(title, author);
    this.issueNumber = issueNumber;
    }
    @Override
    public void displayInfo() {
    super.displayInfo();
    System.out.println("Issue Number: " + issueNumber);
    }
   }
   // Subclass Journal
   class Journal extends LibraryItem {
    private String field;
    public Journal(String title, String author, String field) {
    super(title, author);
    this.field = field;
    }
    @Override
    public void displayInfo() {
    super.displayInfo();
    System.out.println("Field: " + field);
    }
   } 
   public class LibrarySystem {
    public static void main(String[] args) {
    LibraryItem[] items = new LibraryItem[4];
    items[0] = new Book("1984", "George Orwell", "Dystopian");
    items[1] = new Magazine("National Geographic", "Various", 2023);
    items[2] = new Journal("IEEE Transactions", "John Doe", "Engineering");

    items[3] = new Ebook("1984", "Elazhary salah", 10,"A4"); 
    for (LibraryItem item : items) {
    item.displayInfo(); // Polymorphic call
    System.out.println(); // For better readability
    }
    }
   } 
   