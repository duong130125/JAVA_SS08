import java.util.Scanner;

public class BT03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        String password;

        while (true) {
            System.out.print("Nhập email: ");
            email = scanner.nextLine();

            if (email != null && email.length() >= 5) {
                int atIndex = email.indexOf('@');
                int dotIndex = email.lastIndexOf('.');

                if (atIndex > 0 && dotIndex > atIndex && dotIndex < email.length() - 1) {
                    String domain = email.substring(dotIndex + 1);
                    if (domain.equals("com") || domain.equals("vn") || domain.equals("org")) {
                        break;
                    }
                }
            }
            System.out.println("Email không hợp lệ, vui lòng nhập lại!");
        }

        while (true) {
            System.out.print("Nhập mật khẩu: ");
            password = scanner.nextLine();

            if (password != null && password.length() >= 8) {
                boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

                for (int i = 0; i < password.length(); i++) {
                    char ch = password.charAt(i);
                    if (Character.isUpperCase(ch))
                        hasUpper = true;
                    else if (Character.isLowerCase(ch))
                        hasLower = true;
                    else if (Character.isDigit(ch))
                        hasDigit = true;
                    else if ("@#$%!&*".indexOf(ch) != -1)
                        hasSpecial = true;
                }

                if (hasUpper && hasLower && hasDigit && hasSpecial) {
                    break;
                }
            }
            System.out.println("Mật khẩu không hợp lệ, vui lòng nhập lại!");
        }

        System.out.println("Email và mật khẩu hợp lệ!");
    }
}
