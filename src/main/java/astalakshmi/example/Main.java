package astalakshmi.example;

import java.util.ArrayList;

public class Main {
    public static void main() {
      /*  BankAccount acc1 = new BankAccount("Asta", 5000);
        BankAccount acc2 = new BankAccount("Niru", 3000);
        BankAccount acc3 = new BankAccount("Laxmi", 7000);
       acc1.getBankAcountInfo();
         acc2.getBankAcountInfo();
            acc3.getBankAcountInfo();*/


     /*   Customer cus1 = new Customer(101, "Asta", "asta@gmail.com");
        Customer cus2 = new Customer(102, "Niru", " niry@yahoo.co.in");
        Customer cus3 = new Customer(103, "Laxmi", "laksh@gmail.com");
        cus1.getCustomerInfo();
        cus2.getCustomerInfo();
        cus3.getCustomerInfo();*/


/*Student student1 = new Student(1, "Asta Lakshmi", 22, "Computer Science");
Student student2 = new Student(2, "Niru", 23, "Mathematics");
Student student3 = new Student(3, "Laxmi", 21, "Physics");

student1.getStudentInfo();
student2.getStudentInfo();
student3.getStudentInfo();
*/


        Product product1 = new Product(101, "Laptop", 75000.00);
        Product product2 = new Product(102, "Smartphone", 25000.00);
        Product product3 = new Product(103, "Tablet", 15000.00);
        product1.getProductInfo();
        product2.getProductInfo();
        product3.getProductInfo();
Order order1 = new Order(201, new ArrayList<Product>());
Order order2 = new Order(202, new ArrayList<Product>());
Order order3 = new Order(203, new ArrayList<Product>());
order1.addProduct(product1);
order1.addProduct(product2);
order1.getOrderInfo();
order2.addProduct(product2);
order2.addProduct(product3);
order2.getOrderInfo();
order3.addProduct(product1);
order3.addProduct(product3);
order3.getOrderInfo();

        }
    }
