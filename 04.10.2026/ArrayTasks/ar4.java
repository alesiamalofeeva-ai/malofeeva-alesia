public class ar4 {
    public static void main(String[] args) {
        int[] a = {5, 12, 8, 3, 20, 7};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}