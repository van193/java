package models;

public class Student extends Person {
    private String classId;

    public Student(String id, String name, String dob, String gender, String phone, String classId) {
        super(id, name, dob, gender, phone);
        this.classId = classId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sinh viên: " + id + " - " + name + ", " + dob + ", " + gender + ", " + phone + ", Lớp: " + classId);
    }

    public String getClassId() { return classId; }
}
