package Data;
import User.Student;
import User.Teacher;
import java.util.ArrayList;

public class Datalist {
    ArrayList<Teacher> Teacher = new ArrayList<>();
    ArrayList<Student> Student = new ArrayList<>();

    public ArrayList<Teacher> getTeacher() {
        return Teacher;
    }

    public void setTeacher(ArrayList<Teacher> teacher) {
        Teacher = teacher;
    }

    public ArrayList<Student> getStudent() {
        return Student;
    }

    public void setStudent(ArrayList<Student> student) {
        Student = student;
    }

    public void addStudent() {
        Student.add(new Student("std1", "std1", createNew()));
        Student.add(new Student("std2", "std2", createNew()));
        Student.add(new Student("std3", "std3", createNew()));
        Student.add(new Student("std4", "std4", createNew()));
        Student.add(new Student("std5", "std5", createNew()));
    }

    private ArrayList<Subject> createNew() {
        ArrayList<Subject> forStd1 = new ArrayList<>();
        forStd1.add(new Subject(Subjectenum.Mathematic, createNewTask(), createNewExam()));
        forStd1.add(new Subject(Subjectenum.Science, createNewTask(), createNewExam()));
        forStd1.add(new Subject(Subjectenum.Social, createNewTask(), createNewExam()));
        forStd1.add(new Subject(Subjectenum.Art, createNewTask(), createNewExam()));
        forStd1.add(new Subject(Subjectenum.History, createNewTask(), createNewExam()));

        return forStd1;
    }

    private ArrayList<Task> createNewTask() {
        ArrayList<Task> forStd1Task = new ArrayList<>();

        forStd1Task.add(new Task(0));
        forStd1Task.add(new Task(0));
        forStd1Task.add(new Task(0));
        forStd1Task.add(new Task(0));

        return forStd1Task;
    }

    private ArrayList<Exam> createNewExam() {
        ArrayList<Exam> forStd1Task = new ArrayList<>();

        forStd1Task.add(new Exam(0));
        forStd1Task.add(new Exam(0));

        return forStd1Task;
    }

    public void addTeacher() {
        Teacher.add(new Teacher("math", "math", Subjectenum.Mathematic));
        Teacher.add(new Teacher("science", "science", Subjectenum.Science));
        Teacher.add(new Teacher("social", "social", Subjectenum.Social));
        Teacher.add(new Teacher("art", "art", Subjectenum.Art));
        Teacher.add(new Teacher("history", "history", Subjectenum.History));

    }
}
