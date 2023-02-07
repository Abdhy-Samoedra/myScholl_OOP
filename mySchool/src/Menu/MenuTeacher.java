package Menu;

import Data.Datalist;
import Data.Score;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuTeacher {
    Score score = new Score();
    public void menuTeacher(int index, Datalist data) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("======TEACHER %s=======\n",data.getTeacher().get(index).getSubject());
        int input = 0;
        String badInput = null;
        do {
            System.out.println("1. input nilai tugas");
            System.out.println("2. input nilai ujian");
            System.out.println("3. Exit");
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
                    score.inputTugas(index,data);
                    break;
                case 2:
                    score.inputExam(index,data);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Please input number between 1-3");
                    break;
            }

        } while (input != 3);

    }
    }

