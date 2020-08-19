import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    final double PI = 3.1415926;
	    Scanner reader = new Scanner(System.in);
	    System.out.println("Enter the distance to target.\n");
	    double d = reader.nextDouble();
	    System.out.println("Enter the height of the battery relative ti the water line.\n");
	    double h = reader.nextDouble();
	    System.out.println("Enter the initial velocity of the shell.\n");
	    double v = reader.nextDouble();
	    
	    double a = -4.9*(d/v)*(d/v);
	    double b = d;
	    double c = a + h;
	    
	    double tanTheta = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
	    double angle = Math.atan(tanTheta)*180/PI;
	    System.out.println("The angle is" + angle);
	    
	}
}
