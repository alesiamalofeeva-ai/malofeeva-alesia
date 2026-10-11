import java.util.Random;
import java.util.Scanner;
 
public class Sb5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String command;
 
        do {
            System.out.println();
            System.out.println("1. Поздороваться");
            System.out.println("2. Показать случайное число");
            System.out.println("0. Выйти");
            System.out.print("Выберите команду: ");
 
            command = scanner.nextLine().trim();
 
            switch (command) {
                case "1":
                    System.out.println("Привет!");
                    break;
                case "2":
                    System.out.println("Случайное число: " + random.nextInt(100));
                    break;
                case "0":
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неизвестная команда");
            }
        } while (!command.equals("0"));
 
        scanner.close();
    }
}