/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

import javax.swing.JOptionPane;

public class ValidationDecorator implements UserOperations {
    private final UserOperations userOperations;

    public ValidationDecorator(UserOperations userOperations) {
        this.userOperations = userOperations;
    }

    @Override
    public void addUser(String name, String username, String password) {
        if (name.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all fields.");
            return;
        }
        userOperations.addUser(name, username, password);
    }

    @Override
    public void deleteUser(int userId) {
        if (userId <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid User ID.");
            return;
        }
        userOperations.deleteUser(userId);
    }
}
