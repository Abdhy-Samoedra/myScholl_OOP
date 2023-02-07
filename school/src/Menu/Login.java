package Menu;

import School.Data;

import java.util.Scanner;

public class Login {

    MenuStudent mStudent = new MenuStudent();
    MenuTeacher mTeacher = new MenuTeacher();
    Data data = new Data();
    Scanner scan = new Scanner(System.in);

    public int cekLogin(String username, String password) {
        int cek = 0;
        data.dummy();
        for (int i = 0; i < data.listUser.size(); i++) {
            if (data.listUser.get(i).getUsername().equals(username) && data.listUser.get(i).getPassword().equals(password)) {
                cek = i;
            }
        }
        return cek;
    }

    public void login(int cek) {
        if (cek == 1) {
            System.out.println("======LOGIN TEACHER=======");
        } else if (cek == 2) {
            System.out.println("======LOGIN TEACHER=======");
        }
//        System.out.println(cek);
        System.out.print("Username : ");
        String username = scan.nextLine();
        System.out.print("Password : ");
        String password = scan.nextLine();
        int ceklogin = cekLogin(username, password);
        System.out.println("ini cek" + ceklogin);
        if (ceklogin >= 0) {
            System.out.println("login berhasil");
            if (cek == 1) {
                mTeacher.menuTeacher(ceklogin, data);
            }else{
                mStudent.menuStudent();
            }
//            System.out.println(cek);
        } else {
            System.out.println("Salah password atau username");
        }
    }
}
