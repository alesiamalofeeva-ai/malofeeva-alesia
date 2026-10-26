import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Количество домов: ");
        int n = scanner.nextInt();
        
        int[] costs = new int[n];
        System.out.print("Расходы на каждый дом: ");
        for (int i = 0; i < n; i++) {
            costs[i] = scanner.nextInt();
        }
        
        System.out.print("Запас энергии: ");
        int energy = scanner.nextInt();
        
        System.out.println("Максимум домов: " + maxHouses(costs, energy));
    }

    public static int maxHouses(int[] costs, int energy) {
        int left = 0;
        int sum = 0;
        int maxCount = 0;

        for (int right = 0; right < costs.length; right++) {
            sum += costs[right];
            while (sum > energy) {
                sum -= costs[left];
                left++;
            }
            maxCount = Math.max(maxCount, right - left + 1);
        }

        return maxCount;
    }
}