/*Write a Java program that simulates a banking system with multiple customers making withdrawals from a shared account. Each customer, represented by a thread, can input an amount to withdraw, and the program ensures synchronization to prevent race conditions. Enhance the program to allow withdrawals even if the requested amount equals the current balance. */

import java.util.Scanner;
class Account {
    int bal;

    // Constructor to initialize balance
    Account(int bal) {
        this.bal = bal;
    }

    // Method to check if withdrawal is possible
    boolean isSufficientBal(int b) {
        if (bal >= b) { // Modified condition to allow withdrawing equal amount as well
            return true;
        } else {
            return false;
        }
    }

    // Method to perform withdrawal
    public void withdraw(int b) {
        bal -= b; // Deduct withdrawal amount from balance
        System.out.println("Withdraw Successful");
        System.out.println("Current Balance= " + bal);
    }
}

class Customer implements Runnable {
    String name;
    Account account;

    // Constructor to initialize customer with an account
    Customer(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    public void run() {
        synchronized (account) { // Synchronize on account object to avoid race conditions
            Scanner scan = new Scanner(System.in);
            System.out.println(name + " enter the amount= ");
            int amount = scan.nextInt();
            if (account.isSufficientBal(amount)) {
                account.withdraw(amount);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
}

class Bank {
    public static void main(String args[]) {
        Account account = new Account(1000);
        Customer customer1 = new Customer(account, "Payal");
        Customer customer2 = new Customer(account, "Anuj");
        Thread thread1 = new Thread(customer1);
        Thread thread2 = new Thread(customer2);
        thread1.start();
        thread2.start();
    }
}
