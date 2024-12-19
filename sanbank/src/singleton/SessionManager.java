/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SessionManager {

    private static SessionManager instance;
    private String currentUser; // Holds the username of the logged-in user

    private SessionManager() {
        // Private constructor to prevent instantiation
    }

    // Static method to get the singleton instance
    public static SessionManager getInstance() {
        if (instance == null) {
            synchronized (SessionManager.class) {
                if (instance == null) {
                    instance = new SessionManager();
                }
            }
        }
        return instance;
    }

    public boolean authenticate(String username, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankproject", "root", "12345");
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM user WHERE username=? and password=?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                currentUser = username; // Set the current user
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Authentication Failed: " + e.getMessage());
            return false;
        }
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void logout() {
        currentUser = null; // Clear the session
    }
}
