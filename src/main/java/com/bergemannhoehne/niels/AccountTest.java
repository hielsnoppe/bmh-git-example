package main.java.com.bergemannhoehne.niels;

import main.java.com.bergemannhoehne.martina.Account;

public class AccountTest {
    
    public static void main(String[] args) {
        /**
         * Schreibe eine Test-Klasse, in der du die Klasse deines "Nachbarn",
         * die dein Interface implementiert, verwendest und testest.
         */
        
        Account a1 = new MartinaAccount();
        System.out.println(a1.getBalance());

        Account a2 = new MartinaAccount();
        System.out.println(a2.getBalance());

        a1.deposit(100);
        System.out.println(a1.getBalance());

        a2.deposit(200);
        System.out.println(a2.getBalance());

        a1.withdraw(200); // Exception
        System.out.println(a1.getBalance());

        a2.withdraw(100);
        System.out.println(a2.getBalance());

        a1.transfer(50, a2);
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
    }
}
