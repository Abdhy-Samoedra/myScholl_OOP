package Menu;

import Data.Datalist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    Datalist data = new Datalist();
    Login login = new Login();
    Scanner scan = new Scanner(System.in);

    public void showMenu() {
        data.addTeacher();
        data.addStudent();
        int input = 0;
        String badInput = null;
        do {
            System.out.println("======SCHOOL=======");
            System.out.println("Chose account that you want to login");
            System.out.println("1. Teacher");
            System.out.println("2. Student");
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

            int cek = 0;
            switch (input) {
                case 1:
                    cek = 1;
                    login.login(cek, data);
                    break;
                case 2:
                    cek = 2;
                    login.login(cek, data);
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
