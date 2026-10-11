import java.util.Scanner;
public class ScannerBlock1 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		String str = age > 17 ? "Доступ разрешен" : "Доступ не разрешен";
		System.out.println(str);
		
	}
}