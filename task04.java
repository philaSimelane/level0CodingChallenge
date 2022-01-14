public class Main {
	public static void main(String[] args) {
		System.out.println(evenOrOdd(4));
		
	}
	static String evenOrOdd(int number) {
        if (number % 2 == 0)
            return "even";
        else
            return "odd";
    }
}