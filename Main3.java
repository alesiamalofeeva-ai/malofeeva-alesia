import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(minBatteries(n));
    }

    public static int minBatteries(int n) {
        int minCount = Integer.MAX_VALUE;
        for (int a = 0; a * 6 <= n; a++) {
            for (int b = 0; a * 6 + b * 4 <= n; b++) {
                int c = n - a * 6 - b * 4;
                int total = a + b + c;
                if (total < minCount) {
                    minCount = total;
                }
            }
        }

        return minCount;
    }
}