package lab2;

import java.util.ArrayList;
import java.util.List;

public class Faculty implements EmailRecipient {

    private String emailAddress;
    private String name;
    private List<Teacher> teachers = new ArrayList<>();

    public Faculty(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void getTeacher() {
        System.out.println(teachers);

    }
}