package models;
public abstract class Person {
    protected String id;
    protected String name;
    protected String dob;
    protected String gender;
    protected String phone;

    public Person(String id, String name, String dob, String gender, String phone) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
    }

    public abstract void displayInfo();

    public String getId() { return id; }
    public String getName() { return name;}
    public String getDob() { return dob; }
    public String getGender() { return gender; }
    public String getPhone() { return phone; }
}