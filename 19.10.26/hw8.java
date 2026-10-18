public class hw8 {
    public static void printRow(int i, int size) {
        for (int j = 1; j <= size; j++) {
            System.out.print(i * j + "\t");
        }
        System.out.println();
    }

    public static void multiplicationTable(int size) {
        for (int i = 1; i <= size; i++) {
            printRow(i, size);
        }
    }

    public static void main(String[] args) {
        multiplicationTable(5);
    }
}