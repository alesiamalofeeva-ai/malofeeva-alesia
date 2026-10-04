public class m6 {
    public static void main(String[] args) {
        String word = "level";
        boolean s = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                s = false;
                break;
            }
        }

        if (s) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}