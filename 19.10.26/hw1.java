public class hw1 {
	public static long power(int base, int exponent){
		long result = 1;
		for (int i = 0; i < exponent; i++){
			result *= base;
		}
		return result;
	}
	public static void main(String[] args){
		System.out.println(power(2, 3));
        System.out.println(power(5, 0));
	}
}