public class Main2 {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        if (k > 0) {
            System.out.println("Положительное");
        } if (k < 0) {
            System.out.println("Отрицательное");
        } if (k == 0) {
            System.out.println("Ноль");
        }
    }
}