public class Main {
	public static void main(String[] args) {
		System.out.println("Maximum number: " + maximum(3,2,4));
		
	}
	static int maximum(int num1, int num2, int num3) {
				if (num1 > num2 && num1 > num3)
					return num1;
				else if (num2 > num1&& num2 > num3)
					return num2;
				else
					return num3;
	}

		
	


}