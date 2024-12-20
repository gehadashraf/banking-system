/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

import java.sql.*;
import javax.swing.JOptionPane;

public class UserOperationsImpl implements UserOperations {
    private Connection con1;
    private PreparedStatement insert;

    public UserOperationsImpl() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankproject", "root", "2100401");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void addUser(String name, String username, String password) {
        try {
            insert = con1.prepareStatement("INSERT INTO user (name, username, password) VALUES (?, ?, ?)");
            insert.setString(1, name);
            insert.setString(2, username);
            insert.setString(3, password);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Saved");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteUser(int userId) {
        try {
            insert = con1.prepareStatement("DELETE FROM user WHERE id = ?");
            insert.setInt(1, userId);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Deleted");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
