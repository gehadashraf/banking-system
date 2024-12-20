/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.ArrayList;
import java.util.List;

public class TransferSubject {
    private final List<TransferObserver> observers = new ArrayList<>();

    public void addObserver(TransferObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String fromAccount, String toAccount, int amount) {
        for (TransferObserver observer : observers) {
            observer.update(fromAccount, toAccount, amount);
        }
    }
}
