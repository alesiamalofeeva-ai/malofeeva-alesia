public class Main {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        if (k % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
    }
}