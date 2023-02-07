package Menu;

import Data.Datalist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuStudent {

    Scanner scan = new Scanner(System.in);

    public void menuStudent(int index, Datalist data) {
        int input = 0;
        String badInput = null;
        do {
            System.out.println("======STUDENT=======");
            System.out.println("1. Show all Subject");
            System.out.println("2. Show score for each Subject");
            System.out.println("3. Show final score for each Subject");
            System.out.println("4. Exit");
            do {
                try {
                    System.out.print(">> ");
                    input = scan.nextInt();
                    scan.nextLine();
                    badInput = null;
                } catch (InputMismatchException e) {
                    badInput = scan.next();
                    System.out.println("Please input a number");
                }
            } while (badInput != null);

            switch (input) {
                case 1:
                    showSubject(index, data);
                    break;
                case 2:
                    showScore(index, data);
                    break;
                case 3:
                    showFinalScore(index, data);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Please input number between 1-4");
                    break;
            }

        } while (input != 4);

    }

    public void showSubject(int index, Datalist data) {
        System.out.printf("=======================%n");
        System.out.printf("| %-2s | %-14s |%n", "NO", "SUBJECT");
        System.out.printf("=======================%n");
        for (int i = 0; i < data.getStudent().get(index).getMapel().size(); i++) {
            System.out.printf("| %-2s | %-14s |%n", i + 1, data.getStudent().get(index).getMapel().get(i).subjectList);
        }
        System.out.printf("=======================%n");
    }

    public void showScore(int index, Datalist data) {
        System.out.printf("=======================%n");
        System.out.printf("| %-2s | %-14s |%n", "NO", "SUBJECT");
        System.out.printf("=======================%n");
        for (int i = 0; i < data.getStudent().get(index).getMapel().size(); i++) {
            System.out.printf("| %-2s | %-14s |%n", i + 1, data.getStudent().get(index).getMapel().get(i).subjectList);
        }
        System.out.printf("=======================%n");
        int input = 0;
        String badInput = null;
        do {
            System.out.println("Chose Subject");
            do {
                try {
                    System.out.print(">> ");
                    input = scan.nextInt();
                    scan.nextLine();
                    badInput = null;
                } catch (InputMismatchException e) {
                    badInput = scan.next();
                    System.out.println("Please input a number");
                }
            } while (badInput != null);
            if (input < 0 || input > data.getStudent().get(index).getMapel().size()) {
                System.out.printf("Please input number between 1-%d\n", data.getStudent().get(index).getMapel().size());
            }
        } while (input < 0 || input > data.getStudent().get(index).getMapel().size());
        System.out.printf("=================%n");
        System.out.printf("|    %-5s   |%n", data.getStudent().get(index).getMapel().get(input - 1).subjectList);
        System.out.printf("=================%n");
        for (int i = 0; i < data.getStudent().get(index).getMapel().get(input - 1).getTugas().size() ;i++) {
            System.out.printf("|Task %d : %-6d|%n",i+1, data.getStudent().get(index).getMapel().get(input - 1).getTugas().get(i).getTaskScore());
        }
        for (int i = 0; i < data.getStudent().get(index).getMapel().get(input - 1).getUjian().size();i++) {
            System.out.printf("|Exam %d : %-6d|%n",i+1, data.getStudent().get(index).getMapel().get(input - 1).getUjian().get(i).getExamScore());
        }
        System.out.printf("=======================%n");

    }

    public void showFinalScore(int index, Datalist data) {

        System.out.printf("=======================%n");
        System.out.printf("|     FINAL SCORE     |%n");
        System.out.printf("=======================%n");
        for (int i = 0; i < data.getStudent().get(index).getMapel().size(); i++) {
            System.out.printf("|%-11s: %-8.2f|%n", data.getStudent().get(index).getMapel().get(i).subjectList,countScore(index, data, i));
        }

        System.out.printf("=======================%n");
    }

    public double countScore(int index, Datalist data, int sbjIndex) {
        double tugas = 0;
        int i,j;
        for ( i = 0; i < data.getStudent().get(index).getMapel().get(sbjIndex).getTugas().size(); i++) {
            tugas += (data.getStudent().get(index).getMapel().get(sbjIndex).getTugas().get(i).getTaskScore());
        }
        double ujian = 0;
        for ( j = 0; j < data.getStudent().get(index).getMapel().get(sbjIndex).getUjian().size(); j++) {
            ujian += (data.getStudent().get(index).getMapel().get(sbjIndex).getUjian().get(j).getExamScore());
        }

        return (0.4 * (tugas/i)) + (0.6 * (ujian/j));
    }
}