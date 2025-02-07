// Main.java
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hung", 21, "HN");
        Student student3 = new Student("Ha", 22, "HN");
        Student student4 = new Student("Nam", 20, "HN"); // Trùng thông tin với student1
        // Sử dụng HashMap
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1); // Thêm lại student1 với key khác

        System.out.println("== Danh sách sinh viên trong HashMap ==");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Sử dụng HashSet
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4); // Thêm đối tượng trùng thông tin với student1

        System.out.println("\n== Danh sách sinh viên trong HashSet ==");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}