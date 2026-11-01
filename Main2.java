import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.length() >= 1 && s.length() <= 30 && s.matches("[a-z]\\w{2,11}")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}