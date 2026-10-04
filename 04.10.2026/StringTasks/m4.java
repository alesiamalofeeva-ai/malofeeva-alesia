public class m4 {
  public static void main(String[] args) {
    String text = args[0];
    char y = 'a';
    int count = 0;
    for (int i = 0; i < text.length(); i++){
      if (text.charAt(i) == y){
        count ++;
      }
    }  
    System.out.println(count);
  }
}