package Data;

public class Exam {
    protected int examScore;
    Exam(int examScore) {
        this.examScore = examScore;
    }

    public int getExamScore() {
        return examScore;
    }

    public void setExamScore(int examScore) {
        this.examScore = examScore;
    }
}
