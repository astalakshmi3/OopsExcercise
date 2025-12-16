package astalakshmi.example;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        } else {
            System.out.println("Balance cannot be negative");
        }

    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
    public void getBankAcountInfo(){
        System.out.println("Account Holder: " + getAccountNumber() + ", Balance: " + getBalance());

    }
}

