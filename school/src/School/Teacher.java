package School;

public class Teacher extends User {
    Teacher(String username, String password, SubjectEnum subject) {
        super(username, password);
        this.subject = subject;
    }
}
