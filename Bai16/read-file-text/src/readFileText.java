import java.util.Scanner;

public class readFileText {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
    
        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}