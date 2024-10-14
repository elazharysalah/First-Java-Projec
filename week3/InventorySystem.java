package challenge.week3;

class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }

    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
    public void updateQuantity(int addedQuantity, boolean addToExisting) {
        if (addToExisting) {
            this.quantity += addedQuantity;
        } else {
            this.quantity = addedQuantity;
        }
    }

    
    
    public double getPrice() {
        return price;
    }

    public static void welcomeMessage() {
        System.out.println("You are welcome !");
    }
}


class Electronics extends Product {

    private String brand;
    private int warranty;

    public Electronics(String name, double price, int quantity, String brand, int warranty) {
        super(name, price, quantity);
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warranty + " years");
    }
     
}


class Food extends Product {
    private String expirationDate;

    public Food(String name, double price, int quantity, String expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Expiration Date: " + expirationDate);
    }
}


public class InventorySystem {
    public static void main(String[] args) {
        Product.welcomeMessage();

        Electronics laptop = new Electronics("Laptop", 999.99, 10, "TechBrand", 2);
        Food apple = new Food("Apple", 0.99, 100, "2023-12-31");

        System.out.println("\nProduct Information:");

        laptop.displayInfo();
        System.out.println();
        apple.displayInfo();

        System.out.println("\nUpdating quantities:");
        laptop.updateQuantity(15);
        apple.updateQuantity(50, true);

        System.out.println("\nUpdated Product Information:");
        laptop.displayInfo();
        System.out.println();
        apple.displayInfo();
    }
}