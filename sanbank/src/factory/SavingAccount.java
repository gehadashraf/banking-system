/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import factory.IAccount;

/**
 *
 * @author Ahmed
 */
public class SavingAccount implements IAccount {
    @Override
    public void createAccount(String id, String customerId, String balance) {
        System.out.println("Creating Saving Account for customer " + customerId + " with balance: " + balance);
        // Add logic to save to database for Saving Account
    }
}
