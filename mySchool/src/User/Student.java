package User;

import Data.Subject;

import java.util.ArrayList;

public class Student extends Teacher {
    ArrayList<Subject> mapel;

    public Student(String username, String password, ArrayList<Subject> mapel) {
        super(username, password);
        this.mapel = mapel;
    }

    public ArrayList<Subject> getMapel() {
        return mapel;
    }

}
