package Data;

import java.util.ArrayList;

public class Subject {
    public Subjectenum subjectList;
    ArrayList<Task> tugas;
    ArrayList<Exam> ujian;
    public Subject(Subjectenum subjectList,ArrayList<Task> tugas,ArrayList<Exam> ujian)
    {
        this.subjectList = subjectList;
        this.tugas = tugas;
        this.ujian = ujian;
    }

    public ArrayList<Task> getTugas() {
        return tugas;
    }

    public void setTugas(ArrayList<Task> tugas) {
        this.tugas = tugas;
    }

    public ArrayList<Exam> getUjian() {
        return ujian;
    }

    public void setUjian(ArrayList<Exam> ujian) {
        this.ujian = ujian;
    }
}
