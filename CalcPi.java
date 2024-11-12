// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

		int num = Integer.parseInt(args[0]); //input
		int denominator = 1;
		double aprx = 0; 
		int i = 1; //index
		double temp;

		while (i <= num) { //loops num times
			temp = (double) 1 / denominator; //the newest term
			if (i % 2 == 1) //will add or subtract respectively
				aprx = aprx + temp;
			else
				aprx = aprx - temp;
			i ++; //makes i bigger by 1
			denominator = denominator + 2; //adds 2 to the denominator
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + 4 * aprx); //aprx is close to pi/4 as bigger the sum increases
	}
}
