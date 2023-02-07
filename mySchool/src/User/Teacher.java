package User;

import Data.Datalist;
import Data.Subjectenum;

public class Teacher {
    protected String username;
    protected String password;
    protected Subjectenum subject;

    public Teacher(String username, String password, Subjectenum subject) {
        this.username = username;
        this.password = password;
        this.subject = subject;
    }

    // overloading
    public Teacher(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Subjectenum getSubject() {
        return subject;
    }

    public void setSubject(Subjectenum subject) {
        this.subject = subject;
    }






}
