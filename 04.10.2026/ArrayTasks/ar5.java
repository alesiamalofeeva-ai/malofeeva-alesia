public class ar5 {
    public static void main(String[] args) {
        int[] a = {5, -12, 8, -3, 20, -7};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = 0;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}