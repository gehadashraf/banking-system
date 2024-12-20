/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author Ahmed
 */
public interface UserOperations {
    void addUser(String name, String username, String password);
    void deleteUser(int userId);
}
