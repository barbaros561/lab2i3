package lab2;

public  class Teacher extends Person {
    private String courseName;

    public Teacher(String firstName, String lastName, String emailAddress, String courseName) {
        super(firstName, lastName, emailAddress);
        this.courseName = courseName;
    }
    public void setCourseName() {
    }

    public String getCourseName() {
        return courseName;
    }
}
