package AOP;

public class Student {
    private String name;
    private int course;
    private double avaregeGrade;

    public Student(String name, int course, double avaregeGrade) {
        this.name = name;
        this.course = course;
        this.avaregeGrade = avaregeGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvaregeGrade() {
        return avaregeGrade;
    }

    public void setAvaregeGrade(double avaregeGrade) {
        this.avaregeGrade = avaregeGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", avaregeGrade=" + avaregeGrade +
                '}';
    }
}
