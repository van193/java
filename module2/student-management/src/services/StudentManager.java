
import java.util.*;

import exceptions.NotFoundStudentException;
import utils.CSVHelper;

public class StudentManager {
    private static final String FILE_PATH = "data/students.csv";

    public static void addStudent(String name, String dob, String gender, String phone, String classId) {
        List<String[]> students = CSVHelper.readCSV(FILE_PATH);
        int newId = students.size() > 0 ? Integer.parseInt(students.get(students.size() - 1)[0]) + 1 : 1;

        // Validate dữ liệu
        if (!validateStudent(name, dob, gender, phone, classId, students)) {
            return;
        }

        String[] newStudent = {String.valueOf(newId), name, dob, gender, phone, classId};
        students.add(newStudent);
        CSVHelper.writeCSV(FILE_PATH, students);
        System.out.println("Thêm sinh viên thành công!");
    }

    public static void deleteStudent(int studentId) {
        List<String[]> students = CSVHelper.readCSV(FILE_PATH);
        boolean found = false;
        for (String[] student : students) {
            if (Integer.parseInt(student[0]) == studentId) {
                found = true;
                System.out.println("Bạn có chắc chắn muốn xóa sinh viên này? (Yes/No)");
                Scanner sc = new Scanner(System.in);
                String confirm = sc.nextLine();
                if (confirm.equalsIgnoreCase("Yes")) {
                    students.remove(student);
                    CSVHelper.writeCSV(FILE_PATH, students);
                    System.out.println("Xóa sinh viên thành công!");
                }
                return;
            }
        }
        if (!found) {
            throw new NotFoundStudentException("Sinh viên không tồn tại.");
        }
    }

    public static void viewStudents() {
        List<String[]> students = CSVHelper.readCSV(FILE_PATH);
        System.out.println("Danh sách sinh viên:");
        for (String[] student : students) {
            System.out.println(String.join(" | ", student));
        }
    }

    public static void searchStudent(String keyword) {
        List<String[]> students = CSVHelper.readCSV(FILE_PATH);
        System.out.println("Kết quả tìm kiếm:");
        for (String[] student : students) {
            if (student[1].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(String.join(" | ", student));
            }
        }
    }

    private static boolean validateStudent(String name, String dob, String gender, String phone, String classId, List<String[]> students) {
        if (name.length() < 4 || name.length() > 50) {
            System.out.println("Tên sinh viên phải từ 4 đến 50 ký tự.");
            return false;
        }
        if (!dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("Ngày sinh không đúng định dạng dd/MM/yyyy.");
            return false;
        }
        if (!phone.matches("(090|091)\\d{7}")) {
            System.out.println("Số điện thoại phải có 10 số và bắt đầu bằng 090 hoặc 091.");
            return false;
        }
        for (String[] student : students) {
            if (student[4].equals(phone)) {
                System.out.println("Số điện thoại đã tồn tại.");
                return false;
            }
        }
        return true;
    }
}
