package Data;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Score {
    Scanner scan = new Scanner(System.in);

    public void inputTugas(int index, Datalist data) {
        int stdIndex = -1;
        int sbjIndex = -1;
        int tugas1 = 0;
        int tugas2 = 0;
        int tugas3 = 0;
        int tugas4 = 0;
        do {
            System.out.println("Inputkan nama yang ingin dinilai : ");
            String input = scan.nextLine();
            for (int i = 0; i < data.getStudent().size(); i++) {
                if (data.getStudent().get(i).getUsername().equals(input)) {
                    stdIndex = i;
                }
            }
        } while (stdIndex == -1);

        for (int i = 0; i < data.getStudent().get(stdIndex).getMapel().size(); i++) {
            if (data.getStudent().get(stdIndex).getMapel().get(i).subjectList.equals(data.getTeacher().get(index).getSubject())) {
                sbjIndex = i;
            }
        }


        String badInput = null;
        do {
            try {
                System.out.println("Masukkan nilai tugas 1 :");
                tugas1 = scan.nextInt();
                if (tugas1 < 0 || tugas1 > 100) {
                    System.out.println("Please input number between 0 to 100");
                }
                badInput = null;
            } catch (InputMismatchException e) {
                badInput = scan.next();
                System.out.println("Please input a number");
            }

        } while (tugas1 < 0 || tugas1 > 100 || badInput != null);
        do {
            try {
                System.out.println("Masukkan nilai tugas 2 :");
                tugas2 = scan.nextInt();
                if (tugas2 < 0 || tugas2 > 100) {
                    System.out.println("Please input number between 0 to 100");
                }
                badInput = null;
            } catch (InputMismatchException e) {
                badInput = scan.next();
                System.out.println("Please input a number");
            }

        } while (tugas2 < 0 || tugas2 > 100 || badInput != null);
        do {
            try {
                System.out.println("Masukkan nilai tugas 3 :");
                tugas3 = scan.nextInt();
                if (tugas3 < 0 || tugas3 > 100) {
                    System.out.println("Please input number between 0 to 100");
                }
                badInput = null;
            } catch (InputMismatchException e) {
                badInput = scan.next();
                System.out.println("Please input a number");
            }

        } while (tugas3 < 0 || tugas3 > 100 || badInput != null);
        do {
            try {
                System.out.println("Masukkan nilai tugas 4 :");
                tugas4 = scan.nextInt();
                if (tugas4 < 0 || tugas4 > 100) {
                    System.out.println("Please input number between 0 to 100");
                }
                badInput = null;
            } catch (InputMismatchException e) {
                badInput = scan.next();
                System.out.println("Please input a number");
            }

        } while (tugas4 < 0 || tugas4 > 100 || badInput != null);

        data.getStudent().get(stdIndex).getMapel().get(sbjIndex).getTugas().get(0).setTaskScore(tugas1);
        data.getStudent().get(stdIndex).getMapel().get(sbjIndex).getTugas().get(1).setTaskScore(tugas2);
        data.getStudent().get(stdIndex).getMapel().get(sbjIndex).getTugas().get(2).setTaskScore(tugas3);
        data.getStudent().get(stdIndex).getMapel().get(sbjIndex).getTugas().get(3).setTaskScore(tugas4);

    }

    public void inputExam(int index, Datalist data) {
        int stdIndex = -1;
        int sbjIndex = -1;
        int exam1 = 0;
        int exam2 = 0;
        do {
            System.out.println("Inputkan nama yang ingin dinilai : ");
            String input = scan.nextLine();
            for (int i = 0; i < data.getStudent().size(); i++) {
                if (data.getStudent().get(i).getUsername().equals(input)) {
                    stdIndex = i;
                }
            }
        } while (stdIndex == -1);

        for (int i = 0; i < data.getStudent().get(stdIndex).getMapel().size(); i++) {
            if (data.getStudent().get(stdIndex).getMapel().get(i).subjectList.equals(data.getTeacher().get(index).getSubject())) {
                sbjIndex = i;
            }
        }
        String badInput = null;
        do {
            try {
                System.out.println("Masukkan nilai Exam 1 :");
                exam1 = scan.nextInt();
                if (exam1 < 0 || exam1 > 100) {
                    System.out.println("Please input number between 0 to 100");
                }
                badInput = null;
            } catch (InputMismatchException e) {
                badInput = scan.next();
                System.out.println("Please input a number");
            }

        } while (exam1 < 0 || exam1 > 100 || badInput != null);

        do {
            try {
                System.out.println("Masukkan nilai exam 2  :");
                exam2 = scan.nextInt();
                if (exam2 < 0 || exam2 > 100) {
                    System.out.println("Please input number between 0 to 100");
                }
                badInput = null;
            } catch (InputMismatchException e) {
                badInput = scan.next();
                System.out.println("Please input a number");
            }

        } while (exam2 < 0 || exam2 > 100 || badInput != null);

        data.getStudent().get(stdIndex).getMapel().get(sbjIndex).getUjian().get(0).setExamScore(exam1);
        data.getStudent().get(stdIndex).getMapel().get(sbjIndex).getUjian().get(1).setExamScore(exam2);
    }
}

