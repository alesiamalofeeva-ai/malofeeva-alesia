import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String trimmed = s.trim();
            if (trimmed.isEmpty()) {
                System.out.println(0);
            } else {
                String[] words = trimmed.split("[ \\t]+");
                System.out.println(words.length);
            }
        }
        scanner.close();
    }
}