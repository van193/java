package models;

public class Teacher extends Person {
    public Teacher(String id, String name, String dob, String gender, String phone) {
        super(id, name, dob, gender, phone);
    }

    @Override
    public void displayInfo() {
        System.out.println("Giáo viên: " + id + " - " + name + ", " + dob + ", " + gender + ", " + phone);
    }
}
