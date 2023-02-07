package Menu;

import Data.Datalist;

import java.util.Scanner;

public class Login {
    MenuStudent mStudent = new MenuStudent();
    MenuTeacher mTeacher = new MenuTeacher();
    Scanner scan = new Scanner(System.in);

    public int cekLogin(String username, String password, int cek, Datalist data) {
        int index = -1;
        if (cek == 1) {
            for (int i = 0; i < data.getTeacher().size(); i++) {
                if (data.getTeacher().get(i).getUsername().equals(username) && data.getTeacher().get(i).getPassword().equals(password)) {
                    index = i;
                }
            }
        } else if (cek == 2) {
            for (int i = 0; i < data.getStudent().size(); i++) {
                if (data.getStudent().get(i).getUsername().equals(username) && data.getStudent().get(i).getPassword().equals(password)) {
                    index = i;
                }
            }
        }

        return index;
    }

    public void login(int cek, Datalist data) {
        if (cek == 1) {
            System.out.println("======LOGIN TEACHER=======");
        } else if (cek == 2) {
            System.out.println("======LOGIN STUDENT=======");
        }
        System.out.print("Username : ");
        String username = scan.nextLine();
        System.out.print("Password : ");
        String password = scan.nextLine();
        int ceklogin = cekLogin(username, password, cek, data);
        if (ceklogin >= 0) {
            System.out.println("login berhasil");
            if (cek == 1) {
                mTeacher.menuTeacher(ceklogin, data);
            } else {
                mStudent.menuStudent(ceklogin,data);
            }
        } else {
            System.out.println("Salah password atau username");
        }
    }
}
