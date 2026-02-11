import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // predefined credentials
        String correctUsername = "admin";
        String correctPassword = "password123";

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Access Denied");
        }

        scanner.close();
    }
}
