// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

		int num = Integer.parseInt(args[0]);
		int denominator = 1;
		double aprx = 0;
		int i = 1;
		double temp;

		while (i <= num) {
			temp = (double) 1 / denominator;
			if (i % 2 == 1)
				aprx = aprx + temp;
			else
				aprx = aprx - temp;
			i ++;
			denominator = denominator + 2;
		}
		System.out.println("pi, according to Java: " + Math.PI);
		System.out.println("pi, approximated :     " + 4 * aprx);
	}
}
