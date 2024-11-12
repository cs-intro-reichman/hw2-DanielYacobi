// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		int N = Integer.parseInt(args[0]); //highest seed, via input
		String mode = args[1]; //either "v" or "c"
		boolean firstinseq;
		int i = 1; //index for the loop
		int numsinrow; //will return the amount of numbers until the hailstone seq. reaches 1
		int currentnum; //a temporary int who'll save the current value of an item inside the seq.

		while (i <= N) {

			currentnum = i;
			firstinseq = true;
			numsinrow = 0;

			while (currentnum != 1 || firstinseq) {

				if (mode.equals("v")) {
					System.out.print(currentnum + " ");
					numsinrow ++;
				}

				if (firstinseq)
					firstinseq = false;
	
				if (currentnum % 2 == 1)
					currentnum = currentnum * 3 + 1;
				else
					currentnum = currentnum / 2;
			}


			if (mode.equals("v")) {
				numsinrow ++;
				System.out.print(currentnum + " (" + numsinrow + ")");
				System.out.println();
			}

			i ++;
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
