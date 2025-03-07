
import java.util.Scanner;

import services.StudentManager;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Xem danh sách sinh viên");
            System.out.println("4. Tìm kiếm sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Ngày sinh (dd/MM/yyyy): ");
                    String dob = scanner.nextLine();
                    System.out.print("Giới tính: ");
                    String gender = scanner.nextLine();
                    System.out.print("Số điện thoại: ");
                    String phone = scanner.nextLine();
                    System.out.print("Mã lớp: ");
                    String classId = scanner.nextLine();
                    StudentManager.addStudent(name, dob, gender, phone, classId);
                    break;
                case 2:
                    System.out.print("Nhập ID sinh viên: ");
                    int id = scanner.nextInt();
                    StudentManager.deleteStudent(id);
                    break;
                case 3:
                    StudentManager.viewStudents();
                    break;
                case 4:
                    System.out.print("Nhập tên để tìm kiếm: ");
                    String keyword = scanner.nextLine();
                    StudentManager.searchStudent(keyword);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
