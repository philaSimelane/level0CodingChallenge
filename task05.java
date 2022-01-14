public class Main {
	public static void main(String[] args) {
		System.out.println("Area of the triangle is " + Area(3,4,5) + " " + "square centimeters");
		
	}
	static double Area(double side1, double side2, double side3) {
		double semiPerimeter = (1/2.0) * (side1 + side2 + side3);
		double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
		return area;
	}
	
}