
import javax.swing.JOptionPane;
//mahmoud ezat
//2/7/22
// calculation,  and store data for coffee shop
public class EzatPointsEarned {	// class statement call
	private double points;	// private varible for points
	public EzatPointsEarned() {	// no arg constructor
		points = 0;
	}
	
	public void setPoints(double cups2) { // setter for recieving cups to set points
		
		if (cups2 == 1)
		{
		points = 2;
		}
		else if (cups2 == 1) {
			points = 2;
		}
		else if (cups2 == 2) {
			points = 5;
		}
		else if (cups2 == 3) {
			points = 8.1;
		}
		else if (cups2 == 4) {
			points = 11.4;
		}
		else {
			points = cups2 * 3.7;
		}
		
	}
		public double getPoints() {// getter to assign value of points to the method
			return points;
		}
		
		
	}