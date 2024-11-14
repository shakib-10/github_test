
package git.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Garment {

    public String id;
    public String name;
    public String description;
    public String size;
    public String color;
    public double price;
    public int stockQuantity;

    // Constructor
    public Garment(String id, String name, String description, String size, String color, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.size = size;
        this.color = color;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Update the stock quantity of the garment
    void updateStock(int quantity) {
        this.stockQuantity += quantity;
    }

    // Calculate the price after applying a discount percentage
    double calculateDiscountPrice(double discountPercentage) {
        return this.price - (this.price * discountPercentage / 100);
    }
}

class Fabric {

    public String id;
    public String type;
    public String color;
    public double pricePerMeter;

    // Constructor
    public Fabric(String id, String type, String color, double pricePerMeter) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.pricePerMeter = pricePerMeter;
    }

    // Calculate the cost based on the given meters of fabric
    public double calculateCost(double meters) {
        return meters * this.pricePerMeter;
    }
}

class Supplier {

    public String id;
    public String name;
    public String contactInfo;
    private List<Fabric> suppliedFabrics;

    // Constructor
    public Supplier(String id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.suppliedFabrics = new ArrayList<>();
    }

    // Add a fabric to the list of supplied fabrics
    public void addFabric(Fabric fabric) {
        this.suppliedFabrics.add(fabric);
    }

    // Get the list of supplied fabrics
    public List<Fabric> getSuppliedFabrics() {
        return suppliedFabrics;
    }
}

class Order {

    public String orderId;
    public Date orderDate;
    public List<Garment> garments;
    public double totalAmount;

    // Constructor
    public Order(String orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.garments = new ArrayList<>();
        this.totalAmount = 0;
    }

    // Add a garment to the order
    public void addGarment(Garment garment) {
        garments.add(garment);
    }

    // Calculate the total amount for the order based on garments added
    public double calculateTotalAmount() {
        totalAmount = garments.stream().mapToDouble(g -> g.price).sum();
        return totalAmount;
    }

    // Print the details of the order
    void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Garments:");
        for (Garment g : garments) {
            System.out.println("- " + g.name + " (" + g.color + ", " + g.size + "): $" + g.price);
        }
    }
}

class Customer {

    public String customerId;
    public String name;
    public String email;
    public String phone;

    // Constructor
    public Customer(String customerId, String name, String email, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void placeOrder(Order order) {
        // To be implemented in later commits
    }

    public List<Order> viewOrders() {
        // To be implemented in later commits
        return null;
    }
}

class Inventory {

    public List<Garment> garments;

    // Constructor
    public Inventory() {
        this.garments = new ArrayList<>();
    }

    public void addGarment(Garment garment) {
        // To be implemented in later commits
    }

    public void removeGarment(String id) {
        // To be implemented in later commits
    }

    public Garment findGarment(String id) {
        // To be implemented in later commits
        return null;
    }
}

public class GitTest {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}