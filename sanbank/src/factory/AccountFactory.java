/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

public class AccountFactory {
    public static IAccount getAccount(String accountType) {
        if (accountType == null) {
            return null;
        }
        if (accountType.equalsIgnoreCase("Saving")) {
            return new SavingAccount();
        } else if (accountType.equalsIgnoreCase("Fix")) {
            return new FixAccount();
        } else if (accountType.equalsIgnoreCase("Current")) {
            return new CurrentAccount();
        }
        return null;
    }
}
