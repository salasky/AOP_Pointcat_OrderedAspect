import AOP.Student;

import java.util.ArrayList;
import java.util.List;

public class Univesity {

    private List<Student> students=new ArrayList<>();
    public void addStudents(){
        Student st1=new Student("Alex",4,4.4);
        Student st2=new Student("Kate",2,3.5);
        Student st3=new Student("Tom",2,5.0);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }
    public List<Student>getStudents(){
        System.out.println("Информация о студентах");
        System.out.println(students);
        return students;
    }


}
