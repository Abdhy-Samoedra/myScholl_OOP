package School;

import java.util.ArrayList;

public class Data {

    public ArrayList<User> listUser = new ArrayList<>();
    public void dummy() {.
        Student student = new Student("murid", "murid");
        Teacher teacher = new Teacher("tchr","tchr",SubjectEnum.Art);

        //polymorpishm pada Arraylist
        listUser.add(student);
        listUser.add(teacher);
    }



}
