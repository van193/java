// Main.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kiên", 30, "Hà Tĩnh");
        Student student2 = new Student("Nam", 26, "Hà Nội");
        Student student3 = new Student("Anh", 38, "Hà Tĩnh");
        Student student4 = new Student("Tùng", 38, "Hà Tĩnh");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        // Sắp xếp theo tên (Comparable)
        Collections.sort(students);
        System.out.println("== Sắp xếp theo tên (Comparable) ==");
        for (Student st : students) {
            System.out.println(st);
        }

        // Sắp xếp theo tuổi (Comparator)
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(students, ageComparator);
        System.out.println("\n== Sắp xếp theo tuổi (Comparator) ==");
        for (Student st : students) {
            System.out.println(st);
        }
    }
}