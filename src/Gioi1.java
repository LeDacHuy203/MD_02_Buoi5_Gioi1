
import java.util.Scanner;
import java.util.regex.Pattern;

public class Gioi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";
        System.out.print("Nhập mật khẩu: ");
        String pass = scanner.nextLine();
        boolean result = Pattern.matches(regex, pass);
        if (result) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }
    }
}
