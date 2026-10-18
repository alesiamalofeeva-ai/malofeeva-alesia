public class hw24 {
    public static void printDown(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printDown(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("printDown(5):");
        printDown(5);
    }
}