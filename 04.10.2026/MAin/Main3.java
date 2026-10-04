public class Main3 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        boolean hasPassport = Boolean.parseBoolean(args[1]);
        if (age > 18 && hasPassport == true) {
            System.out.println("Можете купить билет");
        } else {
            System.out.println("Не можете купить билет");

        }
    }
}