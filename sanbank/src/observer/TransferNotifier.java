/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

public class TransferNotifier implements TransferObserver {
    @Override
    public void update(String fromAccount, String toAccount, int amount) {
        System.out.println("Notification sent: " + amount + " transferred from " + fromAccount + " to " + toAccount);
    }
}

