import java.util.Scanner; 

public class Mian3 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		if (n.matches("\\w+")){
			System.out.println(n.replaceAll("\\d", "#"));
		}else{
			System.out.println("error");
		}

	}
}