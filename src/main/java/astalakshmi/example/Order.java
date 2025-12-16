package astalakshmi.example;
import java.util.ArrayList;
public class Order {
private int orderId;
private ArrayList <Product> ProductList;
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

    public Order(int orderId) {
        this.orderId = orderId;
        this.orderTotal = 0.0;
    }
    public Order(int orderId, ArrayList<Product> productList) {
        this.orderId = orderId;
        this.ProductList = productList;
        this.orderTotal = calculateOrderTotal();
    }

    private double calculateOrderTotal() {
        double total = 0.0;
        for (Product product : ProductList) {
            total += product.getProductPrice();
        }
        return total;
    }
}
