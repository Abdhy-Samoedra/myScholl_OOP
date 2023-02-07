package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuStudent {
    Scanner scan = new Scanner(System.in);
    public void menuStudent() {
        int input = 0;
        String badInput = null;
//        System.out.println("size array" + data.listUser.size());
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

//            int cek = 0;
            switch (input) {
                case 1:
//                    cek = 1;
//                    showSubject();
                    break;
                case 2:
//                    cek = 2;
//                    showScore();
                    break;
                case 3:
//                    showFinalScore();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Please input number between 1-4");
                    break;
            }

        } while (input != 3);

    }
    }

