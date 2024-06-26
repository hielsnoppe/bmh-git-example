package main.java.com.bergemannhoehne.niels;

import main.java.com.bergemannhoehne.martina.Account;

public class MartinaAccount implements Account {

    private float balance;

    // BEGIN KONSTRUKTOR
    public MartinaAccount() {
        this.balance = 0;
    }
    // ENDE KONSTRUKTOR

    @Override
    public void deposit(float money) {
        this.balance = this.balance + money;
    }

    @Override
    public void withdraw(float money) {
        this.balance = this.balance - money;
    }

    @Override
    public float getBalance() {
        return this.balance;
    }

    @Override
    public void transfer(float money, Account other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transfer'");
    }
    
}
