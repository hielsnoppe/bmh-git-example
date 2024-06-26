package main.java.com.bergemannhoehne.martina;

public interface Account {

    public void deposit(float money);
    public void withdraw(float money);
    public float getBalance();
    public void transfer(float money, Account other);
   
} 
