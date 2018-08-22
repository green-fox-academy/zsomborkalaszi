import java.util.ArrayList;
import java.util.List;

public class Cohort {

    String name;
    List<Student> students;
    List<Mentor> mentors;


    Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void info() {
        System.out.println("The" + " " + name + " cohort has" + " " + students.size() + " students and" + " "
                + mentors.size() + " mentors.");
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

}