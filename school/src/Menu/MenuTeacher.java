package Menu;

import School.Data;

public class MenuTeacher {
//    Data data = new Data();
    public void menuTeacher(int index, Data data) {
        System.out.printf("======TEACHER %s=======\n",data.listUser.get(index).getSubject());
    }
}
