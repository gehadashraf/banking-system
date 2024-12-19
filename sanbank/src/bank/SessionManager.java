package bank;

public class SessionManager {

    // Static instance of the class to implement Singleton pattern
    private static SessionManager instance;

    // User data variables
    private String username;
    private boolean isAuthenticated;

    // Private constructor to prevent instantiation
    private SessionManager() {
        this.username = "";
        this.isAuthenticated = false;
    }

    // Method to get the instance of the class
    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    // Methods to set and get session data
    public void authenticate(String username) {
        this.username = username;
        this.isAuthenticated = true;
    }

    public void logout() {
        this.username = "";
        this.isAuthenticated = false;
    }

    public String getUsername() {
        return this.username;
    }

    public boolean isAuthenticated() {
        return this.isAuthenticated;
    }
}
