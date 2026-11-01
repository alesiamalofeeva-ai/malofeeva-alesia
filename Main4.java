import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(s);
            boolean found = false;
            while (matcher.find()) {
                System.out.println(matcher.group());
                found = true;
            }
            if (!found) {
                System.out.println("NONE");
            }
        }
        scanner.close();
    }
}