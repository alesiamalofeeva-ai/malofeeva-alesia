public class Main4 {
    public static int countWays(int n) {
        return countWaysHelper(n, false);
    }
    private static int countWaysHelper(int n, boolean lastWasTwo) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        int ways = countWaysHelper(n - 1, false);
        if (!lastWasTwo) {
            ways += countWaysHelper(n - 2, true);
        }

        return ways;
    }

    public static void main(String[] args) {
        System.out.println("n = 0: " + countWays(0) + " способ(ов)"); // Ожидается: 1
        System.out.println("n = 3: " + countWays(3) + " способ(ов)"); // Ожидается: 3
        System.out.println("n = 4: " + countWays(4) + " способ(ов)"); // Ожидается: 4
        System.out.println("n = 5: " + countWays(5) + " способ(ов)"); // Для проверки (1+1+1+1+1, 1+1+1+2, 1+1+2+1, 1+2+1+1, 2+1+1+1) = 5
    }
}