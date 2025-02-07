// AgeComparator.java
import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge().compareTo(o2.getAge()); // Sắp xếp theo tuổi (Comparator)
    }
}