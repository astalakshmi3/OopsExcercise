package astalakshmi.example;
import java.util.ArrayList;
public class Order {
    private int orderId;
    private ArrayList<Product> ProductList;
    private double orderTotal;

    public int getOrderId() {
        return orderId;
    }

    public ArrayList<Product> getProductList() {
        return ProductList;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public Order(int orderId, ArrayList<Product> productList) {
        this.orderId = orderId;
        this.ProductList = productList;
        // this.orderTotal = calculateOrderTotal();
    }

    public void addProduct(Product p) {
        ProductList.add(p);
        orderTotal += p.getProductPrice();

    }

    public void removeProduct(Product p) {
        if (ProductList.remove(p)) {
            orderTotal -= p.getProductPrice();
        } else {
            System.out.println("Product not found in the order.");
        }
    }

    public double calculateOrderTotal() {
        double total = 0;
        for (Product p : ProductList) {
            total += p.getProductPrice();
        }

        return total;
    }

    public void getOrderInfo() {
        System.out.println("Order ID: " + getOrderId() + ", Total: " + getOrderTotal());
        System.out.println("Products in the order:");
        for (Product p : ProductList) {
            p.getProductInfo();
        }
    }
}