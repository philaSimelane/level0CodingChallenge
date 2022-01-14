import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		System.out.println(hourAndMins(71));
	}

static String hourAndMins(int number) {
    final DecimalFormat df = new DecimalFormat("0.00");
    double hour = Math.floor(number / 60);
    int hours = (int)hour;
    double mins = number % 60;
    int minutes = (int) mins;
    String time;
    if (hours <= 1 && minutes <= 1) {
    	time = number + " is " + hours + " hour,  " + minutes + " minute"; 
    }
    else if (hours <= 1 && minutes > 1) {
    	time = number +  " is " + hours + " hour, " +minutes + " minutes";
    }
    else if (hours > 1 && minutes <= 1) {
    	time = number + " is " + hours + " hours,  " +minutes + " minutes";
    }
    else {
    	time = number +  " is " + hours + " hours, " +minutes + " minutes";
    }
	
	return time;

}




}