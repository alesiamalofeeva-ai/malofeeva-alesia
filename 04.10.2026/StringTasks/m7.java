public class m7 {
  public static void main(String[] args) {
    String text = args[0];
    
    int count = 0;
    for (int i = 0; i < text.length(); i++){
      char s = text.charAt(i);
      if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'){
        count ++;
      }
    }
    System.out.println(count);
  }
}