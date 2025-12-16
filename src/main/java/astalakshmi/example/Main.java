package astalakshmi.example;

public class Main {
    public static void main() {
        BankAccount acc1 = new BankAccount("Asta", 5000);
        BankAccount acc2 = new BankAccount("Niru", 3000);
        BankAccount acc3 = new BankAccount("Laxmi", 7000);
        System.out.println("Account Holder: " + acc1.getAccountNumber() + ", Balance: " + acc1.getBalance());
        System.out.println("Account Holder: " + acc2.getAccountNumber() + ", Balance: " + acc2.getBalance());
        System.out.println("Account Holder: " + acc3.getAccountNumber() + ", Balance: " + acc3.getBalance());

    }
    }
