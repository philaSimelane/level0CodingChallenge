import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		System.out.println(hourAndMins(371));
	}
	static String hourAndMins(int number) {
	   double hour = Math.floor(number / 60);
	    int hours = (int)hour;
	    double mins = number % 60;
	    int minutes = (int) mins;
	    String time;
	    if (hours <= 1 && minutes <= 1) {
	    	time = hours + " hour,  " + minutes + " minute"; 
	    }
	    else if (hours <= 1 && minutes > 1) {
	    	time = hours + " hour, " +minutes + " minutes";
	    }
	    else if (hours > 1 && minutes <= 1) {
	    	time = hours + " hours,  " + minutes + " minute";
	    }
	    else {
	    	time = hours + " hours, " + minutes + " minutes";
    	}
    	 return time;
	}
}




