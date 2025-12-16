package astalakshmi.example;

public class Customer {
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    private int customerId;
    private String customerName;
    private String customerEmail;

    public Customer(int customerId, String customerName, String customerEmail) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }
    public void getCustomerInfo(){
        System.out.println("Customer ID: " + getCustomerId() + ", Name: " + getCustomerName() + ", Email: " + getCustomerEmail());
    }
}
