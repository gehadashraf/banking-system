/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

public class LoggingDecorator implements UserOperations {
    private final UserOperations userOperations;

    public LoggingDecorator(UserOperations userOperations) {
        this.userOperations = userOperations;
    }

    @Override
    public void addUser(String name, String username, String password) {
        System.out.println("Logging: Adding user - " + username);
        userOperations.addUser(name, username, password);
    }

    @Override
    public void deleteUser(int userId) {
        System.out.println("Logging: Deleting user with ID - " + userId);
        userOperations.deleteUser(userId);
    }
}

