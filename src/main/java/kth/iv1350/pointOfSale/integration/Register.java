package kth.iv1350.pointOfSale.integration;

public class Register {

    private double balance;

    public Register(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void addAmount(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void subtractAmount(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

}
