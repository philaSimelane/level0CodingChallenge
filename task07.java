public class Main {
	public static void main(String[] args) {
		System.out.println("Fahrenheit: " + celsiusToFahrenheit(12));
		System.out.println("Celsius: " +fahrenheitToCelsius(12));
	}
	
	static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = celsius * 9 / 5 + 32;
		return fahrenheit; 
	}
	static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
	}
	 
}