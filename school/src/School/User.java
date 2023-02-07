package School;

public class User {
    protected String password;
    protected String username;
    protected SubjectEnum subject;

    User(String username, String password) {
        this.password = password;
        this.username = username;
    }
    public SubjectEnum getSubject() {
        return subject;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
