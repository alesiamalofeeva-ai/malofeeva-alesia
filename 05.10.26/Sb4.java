import java.util.Scanner;
public class Sb4 {
	public static void main(String[] args){
		Scanner b = new Scanner(System.in);
		System.out.println("первое число");
		double per1 = b.nextDouble();
		System.out.println("второе число");
		double per2 = b.nextInt();
		System.out.println("оператор");
		String op = b.next();
		switch (op){
		    case "+":
		    	System.out.println(per1 + per2);
		    	    break;
		    case "-":
		    	System.out.println(per1 - per2);
		    	    break;
		    case "*":
		    	System.out.println(per1 * per2);
		    	    break;
		    case "/":
		    	System.out.println(per1 / per2);
		    	    break;
		    
		    default:
		    	System.out.println("Нет такого оператора");
		}
	}
}