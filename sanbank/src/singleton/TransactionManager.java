/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author Ahmed
 */
public class TransactionManager {
    private static TransactionManager instance;

    // Private constructor to restrict instantiation
    private TransactionManager() {}

    // Public method to provide access to the instance
    public static synchronized TransactionManager getInstance() {
        if (instance == null) {
            instance = new TransactionManager();
        }
        return instance;
    }

    // Method to handle deposit transactions
    public void deposit(String accountNumber, double amount) {
        // Logic for depositing the amount
        System.out.println("Deposited " + amount + " into account " + accountNumber);
    }

    // Method to handle other transactions (optional)
    public void withdraw(String accountNumber, double amount) {
        // Logic for withdrawing the amount
        System.out.println("Withdrawn " + amount + " from account " + accountNumber);
    }
}
