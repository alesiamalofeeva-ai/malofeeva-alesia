public class ar6 {
    public static void main(String[] args) {
        int[] a = {5, 12, 8, 3, 20, 7};
        int target = 8;
        boolean r = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                r = true;
                break;
            }
        }
        if (r) {
            System.out.println("Есть");
        } else {
            System.out.println("Нет");
        }
    }
}